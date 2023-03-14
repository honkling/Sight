package me.honkling.sight.ui

import me.honkling.sight.ui.style.Style
import net.minecraft.client.MinecraftClient
import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.text.Text

private val client = MinecraftClient.getInstance()

open class GUI(
    val title: String,
    vararg children: Container,
    style: Style
) : Container(
    *children,
    style = style
) {
    fun open() {
        client.setScreenAndRender(object : Screen(Text.literal(title)) {
            override fun render(matrices: MatrixStack, mouseX: Int, mouseY: Int, delta: Float) {
                render(this, matrices)
            }
        })
    }
}