package gg.cookiejar.skinned_lanterns.core.registry;

import gg.cookiejar.skinned_lanterns.common.block.FaceableSkinnedLanternBlock;
import gg.cookiejar.skinned_lanterns.common.block.SkinnedLanternBlock;
import gg.cookiejar.skinned_lanterns.core.SkinnedLanterns;
import gg.cookiejar.skinned_lanterns.core.datagen.SkinnedLanternsLanguage;
import gg.moonflower.pollen.api.platform.Platform;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

/**
 * @author StevenPlayzz
 */
public class SkinnedLanternsBlocks {
    public static final PollinatedRegistry<Block> BLOCKS = PollinatedRegistry.create(Registry.BLOCK, SkinnedLanterns.MOD_ID);

    public static final Supplier<Block> PUFFERFISH_LANTERN_BLOCK = registerBlock("pufferfish_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PUFFERFISH_SOUL_LANTERN_BLOCK = registerBlock("pufferfish_soul_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ZOMBIE_LANTERN_BLOCK = registerBlock("zombie_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ZOMBIE_SOUL_LANTERN_BLOCK = registerBlock("zombie_soul_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> CREEPER_LANTERN_BLOCK = registerBlock("creeper_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> CREEPER_SOUL_LANTERN_BLOCK = registerBlock("creeper_soul_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> SKELETON_LANTERN_BLOCK = registerBlock("skeleton_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> SKELETON_SOUL_LANTERN_BLOCK = registerBlock("skeleton_soul_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> WITHER_SKELETON_LANTERN_BLOCK = registerBlock("wither_skeleton_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> WITHER_SKELETON_SOUL_LANTERN_BLOCK = registerBlock("wither_skeleton_soul_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> BEE_LANTERN_BLOCK = registerBlock("bee_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> BEE_SOUL_LANTERN_BLOCK = registerBlock("bee_soul_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> JACK_O_LANTERN_LANTERN_BLOCK = registerBlock("jack_o_lantern_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> JACK_O_LANTERN_SOUL_LANTERN_BLOCK = registerBlock("jack_o_lantern_soul_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_WHITE_LANTERN_BLOCK = registerBlock("paper_white_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_WHITE_SOUL_LANTERN_BLOCK = registerBlock("paper_white_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> GHOST_LANTERN_BLOCK = registerBlock("ghost_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> GHOST_SOUL_LANTERN_BLOCK = registerBlock("ghost_soul_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> BLINKY_LANTERN_BLOCK = registerBlock("blinky_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> BLINKY_SOUL_LANTERN_BLOCK = registerBlock("blinky_soul_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PINKY_LANTERN_BLOCK = registerBlock("pinky_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PINKY_SOUL_LANTERN_BLOCK = registerBlock("pinky_soul_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> INKY_LANTERN_BLOCK = registerBlock("inky_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> INKY_SOUL_LANTERN_BLOCK = registerBlock("inky_soul_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> CLYDE_LANTERN_BLOCK = registerBlock("clyde_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> CLYDE_SOUL_LANTERN_BLOCK = registerBlock("clyde_soul_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PACMAN_LANTERN_BLOCK = registerBlock("pacman_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PACMAN_SOUL_LANTERN_BLOCK = registerBlock("pacman_soul_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> GUARDIAN_LANTERN_BLOCK = registerBlock("guardian_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> GUARDIAN_SOUL_LANTERN_BLOCK = registerBlock("guardian_soul_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_YELLOW_LANTERN_BLOCK = registerBlock("paper_yellow_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_YELLOW_SOUL_LANTERN_BLOCK = registerBlock("paper_yellow_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_ORANGE_LANTERN_BLOCK = registerBlock("paper_orange_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_ORANGE_SOUL_LANTERN_BLOCK = registerBlock("paper_orange_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_BLUE_LANTERN_BLOCK = registerBlock("paper_blue_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_BLUE_SOUL_LANTERN_BLOCK = registerBlock("paper_blue_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_LIGHT_BLUE_LANTERN_BLOCK = registerBlock("paper_light_blue_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_LIGHT_BLUE_SOUL_LANTERN_BLOCK = registerBlock("paper_light_blue_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_CYAN_LANTERN_BLOCK = registerBlock("paper_cyan_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_CYAN_SOUL_LANTERN_BLOCK = registerBlock("paper_cyan_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_LIME_LANTERN_BLOCK = registerBlock("paper_lime_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_LIME_SOUL_LANTERN_BLOCK = registerBlock("paper_lime_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_GREEN_LANTERN_BLOCK = registerBlock("paper_green_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_GREEN_SOUL_LANTERN_BLOCK = registerBlock("paper_green_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_LANTERN_BLOCK = registerBlock("paper_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_SOUL_LANTERN_BLOCK = registerBlock("paper_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_PINK_LANTERN_BLOCK = registerBlock("paper_pink_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_PINK_SOUL_LANTERN_BLOCK = registerBlock("paper_pink_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_BROWN_LANTERN_BLOCK = registerBlock("paper_brown_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_BROWN_SOUL_LANTERN_BLOCK = registerBlock("paper_brown_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_BLACK_LANTERN_BLOCK = registerBlock("paper_black_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_BLACK_SOUL_LANTERN_BLOCK = registerBlock("paper_black_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_GRAY_LANTERN_BLOCK = registerBlock("paper_gray_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_GRAY_SOUL_LANTERN_BLOCK = registerBlock("paper_gray_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_LIGHT_GRAY_LANTERN_BLOCK = registerBlock("paper_light_gray_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_LIGHT_GRAY_SOUL_LANTERN_BLOCK = registerBlock("paper_light_gray_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_MAGENTA_LANTERN_BLOCK = registerBlock("paper_magenta_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_MAGENTA_SOUL_LANTERN_BLOCK = registerBlock("paper_magenta_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_PURPLE_LANTERN_BLOCK = registerBlock("paper_purple_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PAPER_PURPLE_SOUL_LANTERN_BLOCK = registerBlock("paper_purple_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));

    public static final Supplier<Block> ORNAMENT_RED_LANTERN_BLOCK = registerBlock("ornament_red_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_RED_SOUL_LANTERN_BLOCK = registerBlock("ornament_red_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_BLUE_LANTERN_BLOCK = registerBlock("ornament_blue_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_BLUE_SOUL_LANTERN_BLOCK = registerBlock("ornament_blue_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_PURPLE_LANTERN_BLOCK = registerBlock("ornament_purple_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_PURPLE_SOUL_LANTERN_BLOCK = registerBlock("ornament_purple_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_LIME_LANTERN_BLOCK = registerBlock("ornament_lime_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_LIME_SOUL_LANTERN_BLOCK = registerBlock("ornament_lime_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_MAGENTA_LANTERN_BLOCK = registerBlock("ornament_magenta_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_MAGENTA_SOUL_LANTERN_BLOCK = registerBlock("ornament_magenta_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_YELLOW_LANTERN_BLOCK = registerBlock("ornament_yellow_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_YELLOW_SOUL_LANTERN_BLOCK = registerBlock("ornament_yellow_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_GREEN_LANTERN_BLOCK = registerBlock("ornament_green_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_GREEN_SOUL_LANTERN_BLOCK = registerBlock("ornament_green_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_LIGHT_BLUE_LANTERN_BLOCK = registerBlock("ornament_light_blue_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_LIGHT_BLUE_SOUL_LANTERN_BLOCK = registerBlock("ornament_light_blue_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_CYAN_LANTERN_BLOCK = registerBlock("ornament_cyan_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_CYAN_SOUL_LANTERN_BLOCK = registerBlock("ornament_cyan_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_PINK_LANTERN_BLOCK = registerBlock("ornament_pink_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_PINK_SOUL_LANTERN_BLOCK = registerBlock("ornament_pink_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_ORANGE_LANTERN_BLOCK = registerBlock("ornament_orange_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_ORANGE_SOUL_LANTERN_BLOCK = registerBlock("ornament_orange_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_BROWN_LANTERN_BLOCK = registerBlock("ornament_brown_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_BROWN_SOUL_LANTERN_BLOCK = registerBlock("ornament_brown_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_BLACK_LANTERN_BLOCK = registerBlock("ornament_black_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_BLACK_SOUL_LANTERN_BLOCK = registerBlock("ornament_black_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_WHITE_LANTERN_BLOCK = registerBlock("ornament_white_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_WHITE_SOUL_LANTERN_BLOCK = registerBlock("ornament_white_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_GRAY_LANTERN_BLOCK = registerBlock("ornament_gray_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_GRAY_SOUL_LANTERN_BLOCK = registerBlock("ornament_gray_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_LIGHT_GRAY_LANTERN_BLOCK = registerBlock("ornament_light_gray_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> ORNAMENT_LIGHT_GRAY_SOUL_LANTERN_BLOCK = registerBlock("ornament_light_gray_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PRESENT_GREEN_LANTERN_BLOCK = registerBlock("present_green_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PRESENT_GREEN_SOUL_LANTERN_BLOCK = registerBlock("present_green_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PRESENT_RED_LANTERN_BLOCK = registerBlock("present_red_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> PRESENT_RED_SOUL_LANTERN_BLOCK = registerBlock("present_red_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> SNOWMAN_LANTERN_BLOCK = registerBlock("snowman_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> SNOWMAN_SOUL_LANTERN_BLOCK = registerBlock("snowman_soul_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));

    public static final Supplier<Block> JELLYFISH_LANTERN_BLOCK = registerCompactBlock("jellyfish_lantern_block", "jellyfishing", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> JELLYFISH_SOUL_LANTERN_BLOCK = registerCompactBlock("jellyfish_soul_lantern_block", "jellyfishing", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> BLUE_JELLYFISH_LANTERN_BLOCK = registerCompactBlock("blue_jellyfish_lantern_block", "jellyfishing", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> BLUE_JELLYFISH_SOUL_LANTERN_BLOCK = registerCompactBlock("blue_jellyfish_soul_lantern_block", "jellyfishing", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));

    public static final Supplier<Block> HONEY_LANTERN_BLOCK = registerBlock("honey_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> HONEY_SOUL_LANTERN_BLOCK = registerBlock("honey_soul_lantern_block", () -> new SkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> SLIME_LANTERN_BLOCK = registerBlock("slime_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> SLIME_SOUL_LANTERN_BLOCK = registerBlock("slime_soul_lantern_block", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));

    public static final Supplier<Block> TINY_POTATO_LANTERN_BLOCK = registerCompactBlock("tiny_potato_lantern_block", "botania", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final Supplier<Block> TINY_POTATO_SOUL_LANTERN_BLOCK = registerCompactBlock("tiny_potato_soul_lantern_block", "botania", () -> new FaceableSkinnedLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), new Item.Properties().tab(CreativeModeTab.TAB_MISC));

    private static Supplier<Block> registerBlock(String id, Supplier<Block> block, Item.Properties properties) {
        Supplier<Block> register = BLOCKS.register(id, block);
        SkinnedLanternsItems.ITEMS.register(id, () -> new BlockItem(register.get(), properties));
        SkinnedLanternsLanguage.BLOCKS.put(register, SkinnedLanternsLanguage.capitalize(id));
        return register;
    }

    private static Supplier<Block> registerCompactBlock(String id, String mod, Supplier<Block> block, Item.Properties properties) {
        if (Platform.isModLoaded(mod)) {
            Supplier<Block> register = BLOCKS.register(id, block);
            SkinnedLanternsItems.ITEMS.register(id, () -> new BlockItem(register.get(), properties));
            SkinnedLanternsLanguage.BLOCKS.put(register, SkinnedLanternsLanguage.capitalize(id));
            return register;
        }
        else return null;
    }
}