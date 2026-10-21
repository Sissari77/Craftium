# Axiom documentation parity audit

Reviewed against the official index on 20–21 October 2026. The index yielded 95 linked pages, including introductions, licensing pages and a combined print view; **95 pages does not mean 95 independent features**.

This is a coverage audit for **Craftium 0.3.1-dev**. **Full parity is not complete.** “Functional equivalent” means the core behavior exists, with limits documented in FEATURES.md. “Partial” means documented functionality or interaction remains missing. This table is not a claim of identical algorithms.

| Documentation page | Status | Craftium coverage / gap |
| --- | --- | --- |
| [advanced/commands.html](https://axiomdocs.moulberry.com/advanced/commands.html) | Partial | Craftium commands for UI, diagnostics, capabilities, local cheats and rules; observes WorldEdit pos commands. Real WorldEdit compatibility untested. |
| [advanced/configuration.html](https://axiomdocs.moulberry.com/advanced/configuration.html) | Partial | JSON options, native key mappings and saved layouts; not every documented preference. |
| [advanced/intro.html](https://axiomdocs.moulberry.com/advanced/intro.html) | Overview | Navigation or overview; see the individual behavior rows. |
| [builder/buildertools/clone.html](https://axiomdocs.moulberry.com/builder/buildertools/clone.html) | Partial | Tenth-slot corner/face selection, scroll nudge, modifiers and confirmation. Outline previews; full grid stacking / exact parity unverified. |
| [builder/buildertools/erase.html](https://axiomdocs.moulberry.com/builder/buildertools/erase.html) | Functional equivalent | Cuboid Delete or up to 128 connected same-type blocks from right-click. |
| [builder/buildertools/extrude.html](https://axiomdocs.moulberry.com/builder/buildertools/extrude.html) | Functional equivalent | Connected face grow/shrink from world mouse buttons, with undo. |
| [builder/buildertools/intro.html](https://axiomdocs.moulberry.com/builder/buildertools/intro.html) | Overview | Navigation or overview; see the individual behavior rows. |
| [builder/buildertools/move.html](https://axiomdocs.moulberry.com/builder/buildertools/move.html) | Partial | Tenth-slot corner/face selection, scroll nudge, modifiers and confirmation. Outline previews; full grid stacking / exact parity unverified. |
| [builder/buildertools/setupsymmetry.html](https://axiomdocs.moulberry.com/builder/buildertools/setupsymmetry.html) | Partial | Node at half-block pivots, axis mirrors and fourfold Y rotation; limited node gizmos. |
| [builder/buildertools/smear.html](https://axiomdocs.moulberry.com/builder/buildertools/smear.html) | Partial | Tenth-slot corner/face selection, scroll nudge, modifiers and confirmation. Outline previews; full grid stacking / exact parity unverified. |
| [builder/buildertools/stack.html](https://axiomdocs.moulberry.com/builder/buildertools/stack.html) | Partial | Tenth-slot corner/face selection, scroll nudge, modifiers and confirmation. Outline previews; full grid stacking / exact parity unverified. |
| [builder/colourpicker.html](https://axiomdocs.moulberry.com/builder/colourpicker.html) | Partial | Texture averages, filters, RGB/HSB/hex; no item drag/drop. |
| [builder/gradienthelper.html](https://axiomdocs.moulberry.com/builder/gradienthelper.html) | Functional equivalent | Nine-slot OKLab gradient with endpoints or multiple palette stops, alternatives and hotbar/brush exports. |
| [builder/intro.html](https://axiomdocs.moulberry.com/builder/intro.html) | Partial | Virtual tenth slot with seven tools and familiar corner/face/scroll controls; see builder gaps. |
| [builder/marker.html](https://axiomdocs.moulberry.com/builder/marker.html) | Partial | Create/select/edit/transform markers; incomplete gizmos. |
| [contextmenu/blockattributes.html](https://axiomdocs.moulberry.com/contextmenu/blockattributes.html) | Partial | Collision/light/void diagnostics, hitboxes, fluid opacity and minimum brightness; diagnostic textures remain simplified. |
| [contextmenu/capabilities/bulldozer.html](https://axiomdocs.moulberry.com/contextmenu/capabilities/bulldozer.html) | Functional equivalent | Implemented building capability; see feature limits. |
| [contextmenu/capabilities/forceplace.html](https://axiomdocs.moulberry.com/contextmenu/capabilities/forceplace.html) | Functional equivalent | Implemented building capability; see feature limits. |
| [contextmenu/capabilities/intro.html](https://axiomdocs.moulberry.com/contextmenu/capabilities/intro.html) | Overview | Navigation or overview; see the individual behavior rows. |
| [contextmenu/capabilities/noupdates.html](https://axiomdocs.moulberry.com/contextmenu/capabilities/noupdates.html) | Functional equivalent | Implemented building capability; see feature limits. |
| [contextmenu/capabilities/replacemode.html](https://axiomdocs.moulberry.com/contextmenu/capabilities/replacemode.html) | Functional equivalent | Implemented building capability; see feature limits. |
| [contextmenu/capabilities/tinker.html](https://axiomdocs.moulberry.com/contextmenu/capabilities/tinker.html) | Functional equivalent | Implemented building capability; see feature limits. |
| [contextmenu/displayentities.html](https://axiomdocs.moulberry.com/contextmenu/displayentities.html) | Partial | Create/edit/duplicate/group, fractional gizmos and transform composition; complete property forms and builder-mode handles pending. |
| [contextmenu/intro.html](https://axiomdocs.moulberry.com/contextmenu/intro.html) | Partial | Saved hotbars, modes, flight controls, momentum, camera flight, water opacity, minimum brightness and key hints; inventory rearranging incomplete. |
| [editor/gizmos.html](https://axiomdocs.moulberry.com/editor/gizmos.html) | Partial | Translation axes/centre/planes, rotation rings, scale nodes and snapping; arbitrary local composition and annotation handles incomplete. |
| [editor/intro.html](https://axiomdocs.moulberry.com/editor/intro.html) | Overview | Navigation or overview; see the individual behavior rows. |
| [editor/mainmenubar/edit.html](https://axiomdocs.moulberry.com/editor/mainmenubar/edit.html) | Functional equivalent | Undo/redo, copy/cut/duplicate, pending placement, entities and passenger trees with clipboard. |
| [editor/mainmenubar/file.html](https://axiomdocs.moulberry.com/editor/mainmenubar/file.html) | Partial | Schematic/structure/CSV exports download up to 1 MiB; oversized exports remain on server. |
| [editor/mainmenubar/intro.html](https://axiomdocs.moulberry.com/editor/mainmenubar/intro.html) | Overview | Navigation or overview; see the individual behavior rows. |
| [editor/mainmenubar/operations.html](https://axiomdocs.moulberry.com/editor/mainmenubar/operations.html) | Partial | Selection operations, Analyze, persistent history, rebuild and CIELAB fields; lighting is a bounded approximation. |
| [editor/mainmenubar/select.html](https://axiomdocs.moulberry.com/editor/mainmenubar/select.html) | Functional equivalent | Filter/move/expand/shrink/distort/smooth/bounds/convex and scale. |
| [editor/mainmenubar/view.html](https://axiomdocs.moulberry.com/editor/mainmenubar/view.html) | Partial | Inspector and visibility controls; not every view command. |
| [editor/placement.html](https://axiomdocs.moulberry.com/editor/placement.html) | Partial | Pending outline, transforms, entities, merge, snap and paste variants; RotSprite/Scale2x/Scale3x and textured hologram absent. |
| [editor/selections.html](https://axiomdocs.moulberry.com/editor/selections.html) | Functional equivalent | Voxel sets, combinations, transforms and scale handles; practical limits apply. |
| [editor/toolpresets.html](https://axiomdocs.moulberry.com/editor/toolpresets.html) | Functional equivalent | Named saved option presets; simpler browser. |
| [editor/windows/activeblock.html](https://axiomdocs.moulberry.com/editor/windows/activeblock.html) | Functional equivalent | Typed block state, palette and middle-pick. |
| [editor/windows/blueprints.html](https://axiomdocs.moulberry.com/editor/windows/blueprints.html) | Partial | Client/Server libraries, transfers, metadata, folders and thumbnails; local imports get thumbnails after first load. |
| [editor/windows/clipboard.html](https://axiomdocs.moulberry.com/editor/windows/clipboard.html) | Functional equivalent | Blocks, block entities, optional entities/passengers and placement controls. |
| [editor/windows/history.html](https://axiomdocs.moulberry.com/editor/windows/history.html) | Functional equivalent | Persistent undo/redo, clickable multi-step rewind and full history browser with conflict checks. |
| [editor/windows/intro.html](https://axiomdocs.moulberry.com/editor/windows/intro.html) | Overview | Navigation or overview; see the individual behavior rows. |
| [editor/windows/inventory.html](https://axiomdocs.moulberry.com/editor/windows/inventory.html) | Partial | Current 36 slots and click-to-pick; no item drag/drop. |
| [editor/windows/keybinds.html](https://axiomdocs.moulberry.com/editor/windows/keybinds.html) | Partial | Documented defaults, contextual placement/point shortcuts and configurable editor chords/gestures. Selected-entity copy/paste/delete are routed separately; some configuration toggles and gizmo interactions differ; see [controls audit](KEYBINDS.md). |
| [editor/windows/palette.html](https://axiomdocs.moulberry.com/editor/windows/palette.html) | Functional equivalent | Ordered weighted palettes, block search, drag/reorder, hotbar input and saved palettes. |
| [editor/windows/styleeditor.html](https://axiomdocs.moulberry.com/editor/windows/styleeditor.html) | Partial | Colour settings and saved layouts; no complete style editor. |
| [editor/windows/targetinfo.html](https://axiomdocs.moulberry.com/editor/windows/targetinfo.html) | Functional equivalent | Target block coordinates and identifier, plus selected cell count. |
| [editor/windows/textannotations.html](https://axiomdocs.moulberry.com/editor/windows/textannotations.html) | Partial | Saved notes, polylines and small images; fine handles and full text styling missing. |
| [editor/windows/toolmasks.html](https://axiomdocs.moulberry.com/editor/windows/toolmasks.html) | Partial | Nested visual drag/drop rule blocks, expressions and sandboxed Lua; visual editor limited to 128 rules. |
| [editor/windows/tooloptions.html](https://axiomdocs.moulberry.com/editor/windows/tooloptions.html) | Partial | Paged detailed options and tool presets; not every Axiom option. |
| [editor/windows/views.html](https://axiomdocs.moulberry.com/editor/windows/views.html) | Partial | Named position/dimension/rotation save/load; pinned viewport tabs absent. |
| [editor/windows/worldproperties.html](https://axiomdocs.moulberry.com/editor/windows/worldproperties.html) | Functional equivalent | Time/weather, spawning, gravity, drops, farmland, invulnerability and ticks. |
| [intro.html](https://axiomdocs.moulberry.com/intro.html) | Overview | Navigation or overview; see the individual behavior rows. |
| [other/commerciallicense.html](https://axiomdocs.moulberry.com/other/commerciallicense.html) | Not applicable | Axiom commercial licensing/accounts/whitelist/resources are not Craftium features. |
| [other/intro.html](https://axiomdocs.moulberry.com/other/intro.html) | Not applicable | Axiom commercial licensing/accounts/whitelist/resources are not Craftium features. |
| [other/resources.html](https://axiomdocs.moulberry.com/other/resources.html) | Not applicable | Axiom commercial licensing/accounts/whitelist/resources are not Craftium features. |
| [other/whitelist.html](https://axiomdocs.moulberry.com/other/whitelist.html) | Not applicable | Axiom commercial licensing/accounts/whitelist/resources are not Craftium features. |
| [print.html](https://axiomdocs.moulberry.com/print.html) | Overview | Navigation or overview; see the individual behavior rows. |
| [tools/drawing/freehanddraw.html](https://axiomdocs.moulberry.com/tools/drawing/freehanddraw.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/drawing/intro.html](https://axiomdocs.moulberry.com/tools/drawing/intro.html) | Overview | Navigation or overview; see the individual behavior rows. |
| [tools/drawing/melt.html](https://axiomdocs.moulberry.com/tools/drawing/melt.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/drawing/modelling.html](https://axiomdocs.moulberry.com/tools/drawing/modelling.html) | Partial | Hull/triangles/lofts; Smart maps to hull and node handles are limited. |
| [tools/drawing/path.html](https://axiomdocs.moulberry.com/tools/drawing/path.html) | Partial | Line/curves/catenary-like modes, loops/grounding/stair heuristics. |
| [tools/drawing/rock.html](https://axiomdocs.moulberry.com/tools/drawing/rock.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/drawing/sculptdraw.html](https://axiomdocs.moulberry.com/tools/drawing/sculptdraw.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/drawing/shape.html](https://axiomdocs.moulberry.com/tools/drawing/shape.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/drawing/stamp.html](https://axiomdocs.moulberry.com/tools/drawing/stamp.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/drawing/text.html](https://axiomdocs.moulberry.com/tools/drawing/text.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/drawing/weld.html](https://axiomdocs.moulberry.com/tools/drawing/weld.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/fluid/floodfill.html](https://axiomdocs.moulberry.com/tools/fluid/floodfill.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/fluid/fluidball.html](https://axiomdocs.moulberry.com/tools/fluid/fluidball.html) | Partial | Bounded flow approximation; not the same fluid simulator. |
| [tools/fluid/intro.html](https://axiomdocs.moulberry.com/tools/fluid/intro.html) | Overview | Navigation or overview; see the individual behavior rows. |
| [tools/heightmap/elevation.html](https://axiomdocs.moulberry.com/tools/heightmap/elevation.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/heightmap/intro.html](https://axiomdocs.moulberry.com/tools/heightmap/intro.html) | Overview | Navigation or overview; see the individual behavior rows. |
| [tools/heightmap/slope.html](https://axiomdocs.moulberry.com/tools/heightmap/slope.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/intro.html](https://axiomdocs.moulberry.com/tools/intro.html) | Overview | Navigation or overview; see the individual behavior rows. |
| [tools/manipulation/distort.html](https://axiomdocs.moulberry.com/tools/manipulation/distort.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/manipulation/extrude.html](https://axiomdocs.moulberry.com/tools/manipulation/extrude.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/manipulation/intro.html](https://axiomdocs.moulberry.com/tools/manipulation/intro.html) | Overview | Navigation or overview; see the individual behavior rows. |
| [tools/manipulation/modify.html](https://axiomdocs.moulberry.com/tools/manipulation/modify.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/manipulation/roughen.html](https://axiomdocs.moulberry.com/tools/manipulation/roughen.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/manipulation/shatter.html](https://axiomdocs.moulberry.com/tools/manipulation/shatter.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/manipulation/smooth.html](https://axiomdocs.moulberry.com/tools/manipulation/smooth.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/painting/biomepainter.html](https://axiomdocs.moulberry.com/tools/painting/biomepainter.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/painting/gradientpainter.html](https://axiomdocs.moulberry.com/tools/painting/gradientpainter.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/painting/intro.html](https://axiomdocs.moulberry.com/tools/painting/intro.html) | Overview | Navigation or overview; see the individual behavior rows. |
| [tools/painting/noisepainter.html](https://axiomdocs.moulberry.com/tools/painting/noisepainter.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/painting/painter.html](https://axiomdocs.moulberry.com/tools/painting/painter.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/painting/scriptbrush.html](https://axiomdocs.moulberry.com/tools/painting/scriptbrush.html) | Partial | Sandboxed Lua subset; see supported API in FEATURES. |
| [tools/selection/boxselect.html](https://axiomdocs.moulberry.com/tools/selection/boxselect.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/selection/freehandselect.html](https://axiomdocs.moulberry.com/tools/selection/freehandselect.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/selection/intro.html](https://axiomdocs.moulberry.com/tools/selection/intro.html) | Overview | Navigation or overview; see the individual behavior rows. |
| [tools/selection/lasso.html](https://axiomdocs.moulberry.com/tools/selection/lasso.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/selection/magicselect.html](https://axiomdocs.moulberry.com/tools/selection/magicselect.html) | Functional equivalent | Implemented; algorithm and option differences are listed in FEATURES.md. |
| [tools/utility/annotation.html](https://axiomdocs.moulberry.com/tools/utility/annotation.html) | Partial | Text/line/box/polyline and low-resolution world images with undo. |
| [tools/utility/intro.html](https://axiomdocs.moulberry.com/tools/utility/intro.html) | Overview | Navigation or overview; see the individual behavior rows. |
| [tools/utility/ruler.html](https://axiomdocs.moulberry.com/tools/utility/ruler.html) | Partial | Chains, circles, split, center select and axis movement; complete angle/bounds UI absent. |

## Major unfinished areas

See [FEATURES.md](FEATURES.md): resampling modes, arbitrary docking/pinned views, full styles/display forms, annotation resolution, inventory item manipulation, schematic metadata and exact algorithm/option parity remain unfinished.

## Evidence

[VALIDATION.md](VALIDATION.md) records builds, unit and Minecraft integration tests. Tests check selected scenarios; they do not certify full documentation parity or broad server/modpack compatibility.
