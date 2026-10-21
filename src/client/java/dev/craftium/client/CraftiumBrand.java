package dev.craftium.client;

import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.resources.Identifier;

/** One shared mark for the mod listing, editor and builder HUD. */
final class CraftiumBrand {
    private static final Identifier ICON=Identifier.fromNamespaceAndPath("craftium","icon.png");
    private CraftiumBrand(){}
    static void draw(GuiGraphicsExtractor graphics,int x,int y,int size){
        graphics.blit(RenderPipelines.GUI_TEXTURED,ICON,x,y,0,0,size,size,128,128,128,128,0xffffffff);
    }
}
