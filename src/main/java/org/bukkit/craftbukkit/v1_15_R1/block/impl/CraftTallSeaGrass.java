/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.v1_15_R1.block.impl;

import net.minecraft.state.EnumProperty;

public final class CraftTallSeaGrass extends org.bukkit.craftbukkit.v1_15_R1.block.data.CraftBlockData implements org.bukkit.block.data.Bisected {

    public CraftTallSeaGrass() {
        super();
    }

    public CraftTallSeaGrass(net.minecraft.block.BlockState state) {
        super(state);
    }

    // org.bukkit.craftbukkit.v1_15_R1.block.data.CraftBisected

    private static final EnumProperty<?> HALF = getEnum(net.minecraft.block.TallSeaGrassBlock.class, "half");

    @Override
    public Half getHalf() {
        return get(HALF, Half.class);
    }

    @Override
    public void setHalf(Half half) {
        set(HALF, half);
    }
}
