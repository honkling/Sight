package me.honkling.sight.ui

import me.honkling.sight.ui.style.MeasurementType
import me.honkling.sight.ui.style.Style
import net.minecraft.client.gui.DrawableHelper
import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.util.math.MatrixStack

open class Container(
    vararg val children: Container,
    val style: Style = Style()
) {
    fun render(screen: Screen, matrixStack: MatrixStack) {
        var x = 0
        var y = 0

        style.alignment.forEach { (alignment, measurement) ->
            val pixels = measurement.getPixels(screen, alignment.isHorizontal())

            if (alignment.isHorizontal()) x += pixels
            else y += pixels
        }

        DrawableHelper.fill(
            matrixStack,
            x,
            y,
            x + style.width.getPixels(screen, true),
            y + style.height.getPixels(screen, false),
            style.backgroundColor.toInt())

        children.forEach { it.render(screen, matrixStack) }
    }
}