package dev.craftium.server;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

/** Block entity data is included so undo and clipboard never silently discard inventories. */
public record BlockSnapshot(BlockState state, CompoundTag data) {
    public static BlockSnapshot capture(ServerLevel level, BlockPos pos) {
        var entity = level.getBlockEntity(pos);
        return new BlockSnapshot(level.getBlockState(pos), entity == null ? null : entity.saveWithFullMetadata(level.registryAccess()));
    }
    public BlockSnapshot(BlockState state) { this(state,null); }
    public void place(ServerLevel level, BlockPos pos, int flags) {
        // Suppress drops: an undoable editor operation must not duplicate container contents as item entities.
        if (level.getBlockEntity(pos) != null) level.removeBlockEntity(pos);
        level.setBlock(pos,state,flags | 32);
        if (data != null) {
            var entity = BlockEntity.loadStatic(pos,state,data.copy(),level.registryAccess());
            if (entity != null) { level.setBlockEntity(entity); entity.setChanged(); }
        }
        level.sendBlockUpdated(pos,state,state,2);
    }
    public boolean matches(ServerLevel level, BlockPos pos) {
        if (level.getBlockState(pos) != state) return false;
        var entity = level.getBlockEntity(pos);
        return data == null ? entity == null : entity != null && data.equals(entity.saveWithFullMetadata(level.registryAccess()));
    }
}
