package kr.enchantlimits.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * Randomly generated enchantments (enchanting table, enchanted loot, villager trades) go at most to level VI.
 * Higher levels (up to the enchantment's max level, see the enchant-plus datapack) only come from the anvil.
 */
@Mixin(EnchantmentHelper.class)
public abstract class EnchantmentHelperMixin {
    private static final int RANDOM_MAX_LEVEL = 6;

    // method_60106: the per enchantment lambda of getPossibleEntries that walks the levels from getMaxLevel() down

    @Redirect(method = "method_60106", at = @At(value = "INVOKE", target = "Lnet/minecraft/enchantment/Enchantment;getMaxLevel()I"))
    private static int enchantlimits$capRandomLevel(Enchantment enchantment) {
        return Math.min(enchantment.getMaxLevel(), RANDOM_MAX_LEVEL);
    }
}
