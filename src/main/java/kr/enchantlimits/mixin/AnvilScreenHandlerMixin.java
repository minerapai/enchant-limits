package kr.enchantlimits.mixin;

import net.minecraft.screen.AnvilScreenHandler;
import net.minecraft.screen.Property;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** No "Too Expensive!": anvil costs above 39 levels are lowered to 39 instead of blocking the result. */
@Mixin(AnvilScreenHandler.class)
public abstract class AnvilScreenHandlerMixin {
    private static final int MAX_COST = 39;

    @Shadow
    @Final
    private Property levelCost;

    @ModifyConstant(method = "updateResult", constant = @Constant(intValue = 40))
    private int enchantlimits$noTooExpensive(int original) {
        return Integer.MAX_VALUE;
    }

    @Inject(method = "updateResult", at = @At("RETURN"))
    private void enchantlimits$capCost(CallbackInfo ci) {
        if (levelCost.get() > MAX_COST) {
            levelCost.set(MAX_COST);
        }
    }
}
