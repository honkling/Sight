package me.honkling.sight.ui.style

import net.minecraft.client.gui.screen.Screen

data class Measurement(val amount: Int, val type: MeasurementType) {
    fun getPixels(screen: Screen, horizontal: Boolean): Int {
        return when (type) {
            MeasurementType.PIXELS -> amount
            MeasurementType.PERCENT -> {
                val factor = if (horizontal) screen.width else screen.height
                (factor * (amount / 100.0)).toInt()
            }
        }
    }
}
