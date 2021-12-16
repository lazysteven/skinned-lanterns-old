package me.stevenplayzz.skinnedlanterns;

import com.google.common.reflect.Reflection;
import me.stevenplayzz.skinnedlanterns.block.SkinnedLanternBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SkinnedLanterns implements ModInitializer {
	public static final String MOD_ID   = "skinnedlanterns";
	public static final String MOD_NAME = "Skinned Lanterns";

	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "item_group"), () -> new ItemStack(SkinnedLanternBlocks.PUFFERFISH_LANTERN_BLOCK));

	@SuppressWarnings("UnstableApiUsage")
	@Override
	public void onInitialize() {
		LOGGER.info("Initializing {}", MOD_NAME);
		Reflection.initialize(SkinnedLanternBlocks.class);
		LOGGER.info("Initialized {}", MOD_NAME);
	}

	public static Identifier id(String name) {
		return new Identifier(MOD_ID, name);
	}

	//        PUFFERFISH_LANTERN_BLOCK
	//        PUFFERFISH_SOUL_LANTERN_BLOCK
	//        ZOMBIE_LANTERN_BLOCK
	//        ZOMBIE_SOUL_LANTERN_BLOCK
	//        CREEPER_LANTERN_BLOCK
	//        CREEPER_SOUL_LANTERN_BLOCK
	//        SKELETON_LANTERN_BLOCK
	//        SKELETON_SOUL_LANTERN_BLOCK
	//        WITHER_SKELETON_LANTERN_BLOCK
	//        WITHER_SKELETON_SOUL_LANTERN_BLOCK
	//        BEE_LANTERN_BLOCK
	//        BEE_SOUL_LANTERN_BLOCK
	//        JACK_O_LANTERN_LANTERN_BLOCK
	//        JACK_O_LANTERN_SOUL_LANTERN_BLOCK
	//        PAPER_WHITE_LANTERN_BLOCK
	//        PAPER_WHITE_SOUL_LANTERN_BLOCK
	//        GHOST_LANTERN_BLOCK
	//        GHOST_SOUL_LANTERN_BLOCK
	//        BLINKY_LANTERN_BLOCK
	//        BLINKY_SOUL_LANTERN_BLOCK
	//        PINKY_LANTERN_BLOCK
	//        PINKY_SOUL_LANTERN_BLOCK
	//        INKY_LANTERN_BLOCK
	//        INKY_SOUL_LANTERN_BLOCK
	//        CLYDE_LANTERN_BLOCK
	//        CLYDE_SOUL_LANTERN_BLOCK
	//        PACMAN_LANTERN_BLOCK
	//        PACMAN_SOUL_LANTERN_BLOCK
	//        GUARDIAN_LANTERN_BLOCK
	//        GUARDIAN_SOUL_LANTERN_BLOCK
	//        PAPER_YELLOW_LANTERN_BLOCK
	//        PAPER_YELLOW_SOUL_LANTERN_BLOCK
	//        PAPER_ORANGE_LANTERN_BLOCK
	//        PAPER_ORANGE_SOUL_LANTERN_BLOCK
	//        PAPER_BLUE_LANTERN_BLOCK
	//        PAPER_BLUE_SOUL_LANTERN_BLOCK
	//        PAPER_LIGHT_BLUE_LANTERN_BLOCK
	//        PAPER_LIGHT_BLUE_SOUL_LANTERN_BLOCK
	//        PAPER_CYAN_LANTERN_BLOCK
	//        PAPER_CYAN_SOUL_LANTERN_BLOCK
	//        PAPER_LIME_LANTERN_BLOCK
	//        PAPER_LIME_SOUL_LANTERN_BLOCK
	//        PAPER_GREEN_LANTERN_BLOCK
	//        PAPER_GREEN_SOUL_LANTERN_BLOCK
	//        PAPER_LANTERN_BLOCK
	//        PAPER_SOUL_LANTERN_BLOCK
	//        PAPER_PINK_LANTERN_BLOCK
	//        PAPER_PINK_SOUL_LANTERN_BLOCK
	//        PAPER_BROWN_LANTERN_BLOCK
	//        PAPER_BROWN_SOUL_LANTERN_BLOCK
	//        PAPER_BLACK_LANTERN_BLOCK
	//        PAPER_BLACK_SOUL_LANTERN_BLOCK
	//        PAPER_GRAY_LANTERN_BLOCK
	//        PAPER_GRAY_SOUL_LANTERN_BLOCK
	//        PAPER_LIGHT_GRAY_LANTERN_BLOCK
	//        PAPER_LIGHT_GRAY_SOUL_LANTERN_BLOCK
	//        PAPER_MAGENTA_LANTERN_BLOCK
	//        PAPER_MAGENTA_SOUL_LANTERN_BLOCK
	//        PAPER_PURPLE_LANTERN_BLOCK
	//        PAPER_PURPLE_SOUL_LANTERN_BLOCK
	//
	//        ORNAMENT_RED_LANTERN_BLOCK
	//        ORNAMENT_RED_SOUL_LANTERN_BLOCK
	//        ORNAMENT_BLUE_LANTERN_BLOCK
	//        ORNAMENT_BLUE_SOUL_LANTERN_BLOCK
	//        ORNAMENT_PURPLE_LANTERN_BLOCK
	//        ORNAMENT_PURPLE_SOUL_LANTERN_BLOCK
	//        ORNAMENT_LIME_LANTERN_BLOCK
	//        ORNAMENT_LIME_SOUL_LANTERN_BLOCK
	//        ORNAMENT_MAGENTA_LANTERN_BLOCK
	//        ORNAMENT_MAGENTA_SOUL_LANTERN_BLOCK
	//        ORNAMENT_YELLOW_LANTERN_BLOCK
	//        ORNAMENT_YELLOW_SOUL_LANTERN_BLOCK
	//        ORNAMENT_GREEN_LANTERN_BLOCK
	//        ORNAMENT_GREEN_SOUL_LANTERN_BLOCK
	//        ORNAMENT_LIGHT_BLUE_LANTERN_BLOCK
	//        ORNAMENT_LIGHT_BLUE_SOUL_LANTERN_BLOCK
	//        ORNAMENT_CYAN_LANTERN_BLOCK
	//        ORNAMENT_CYAN_SOUL_LANTERN_BLOCK
	//        ORNAMENT_PINK_LANTERN_BLOCK
	//        ORNAMENT_PINK_SOUL_LANTERN_BLOCK
	//        ORNAMENT_ORANGE_LANTERN_BLOCK
	//        ORNAMENT_ORANGE_SOUL_LANTERN_BLOCK
	//        ORNAMENT_BROWN_LANTERN_BLOCK
	//        ORNAMENT_BROWN_SOUL_LANTERN_BLOCK
	//        ORNAMENT_BLACK_LANTERN_BLOCK
	//        ORNAMENT_BLACK_SOUL_LANTERN_BLOCK
	//        ORNAMENT_WHITE_LANTERN_BLOCK
	//        ORNAMENT_WHITE_SOUL_LANTERN_BLOCK
	//        ORNAMENT_GRAY_LANTERN_BLOCK
	//        ORNAMENT_GRAY_SOUL_LANTERN_BLOCK
	//        ORNAMENT_LIGHT_GRAY_LANTERN_BLOCK
	//        ORNAMENT_LIGHT_GRAY_SOUL_LANTERN_BLOCK
	//        PRESENT_GREEN_LANTERN_BLOCK
	//        PRESENT_GREEN_SOUL_LANTERN_BLOCK
	//        PRESENT_RED_LANTERN_BLOCK
	//        PRESENT_RED_SOUL_LANTERN_BLOCK
	//        SNOWMAN_LANTERN_BLOCK
	//        SNOWMAN_SOUL_LANTERN_BLOCK
	//
	//        JELLYFISH_LANTERN_BLOCK
	//        JELLYFISH_SOUL_LANTERN_BLOCK
	//        BLUE_JELLYFISH_LANTERN_BLOCK
	//        BLUE_JELLYFISH_SOUL_LANTERN_BLOCK
	//
	//        HONEY_LANTERN_BLOCK
	//        HONEY_SOUL_LANTERN_BLOCK
	//        SLIME_LANTERN_BLOCK
	//        SLIME_SOUL_LANTERN_BLOCK
	//
	//        LIL_TATER_LANTERN_BLOCK
	//        LIL_TATER_SOUL_LANTERN_BLOCK
}