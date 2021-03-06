package com.ryangar46.apollo.tag;

import com.ryangar46.apollo.Apollo;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.dimension.DimensionType;

public class TagManager {
    public static final TagKey<Item> AIRTIGHT_BOOTS = registerItem("airtight_boots");
    public static final TagKey<Item> AIRTIGHT_CHESTPLATES = registerItem("airtight_chestplates");
    public static final TagKey<Item> AIRTIGHT_HELMETS = registerItem("airtight_helmets");
    public static final TagKey<Item> AIRTIGHT_LEGGINGS = registerItem("airtight_leggings");
    public static final TagKey<DimensionType> ATMOSPHERE_NOT_VISIBLE_WORLDS = registerDimensionType("atmosphere_not_visible_worlds");
    public static final TagKey<DimensionType> EARTH_VISIBLE_WORLDS = registerDimensionType("earth_visible_worlds");
    public static final TagKey<Block> FLUID_PIPE_CONNECTABLE_BLOCKS = registerBlock("fluid_pipe_connectable_blocks");
    public static final TagKey<Block> LAUNCHPADS = registerBlock("launchpads");
    public static final TagKey<Item> NEGATIVE_GRAVITY_EQUIPABLES = registerItem("negative_gravity_equipables");
    public static final TagKey<DimensionType> METEORITE_SPAWNING_WORLDS = registerDimensionType("meteorite_spawning_worlds");
    public static final TagKey<Item> POSITIVE_GRAVITY_EQUIPABLES = registerItem("positive_gravity_equipables");
    public static final TagKey<EntityType<?>> VACUUM_IMMUNE_CREATURES = registerEntityType("vacuum_immune_creatures");

    private static TagKey<Item> registerItem(String id) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier(Apollo.MOD_ID, id));
    }

    private static TagKey<Block> registerBlock(String id) {
        return TagKey.of(Registry.BLOCK_KEY, new Identifier(Apollo.MOD_ID, id));
    }

    private static TagKey<EntityType<?>> registerEntityType(String id) {
        return TagKey.of(Registry.ENTITY_TYPE_KEY, new Identifier(Apollo.MOD_ID, id));
    }

    private static TagKey<DimensionType> registerDimensionType(String id) {
        return TagKey.of(Registry.DIMENSION_TYPE_KEY, new Identifier(Apollo.MOD_ID, id));
    }
}
