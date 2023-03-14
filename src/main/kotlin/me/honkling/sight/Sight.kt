package me.honkling.sight

import me.honkling.sight.ui.impl.getTestGUI
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
import net.minecraft.client.option.KeyBinding
import net.minecraft.client.util.InputUtil
import org.apache.logging.log4j.LogManager

@Environment(EnvType.CLIENT)
class Sight : ClientModInitializer {
    val logger = LogManager.getLogger("Sight")
    val keybinding = KeyBindingHelper.registerKeyBinding(KeyBinding(
        "tmp",
        InputUtil.GLFW_KEY_K,
        "a"
    ))

    override fun onInitializeClient() {
        logger.info("Sight is ready.")

        ClientTickEvents.END_CLIENT_TICK.register {
            while (keybinding.wasPressed())
                getTestGUI().open()
        }
    }
}