package me.honkling.sight.ui.impl

import me.honkling.sight.ui.GUI
import me.honkling.sight.ui.style.*

fun getTestGUI(): GUI {
    return GUI(
        "Test GUI",
        style = Style(
            width = measurement("50%"),
            height = measurement("50%"),
            backgroundColor = Color("#000000", 70),
            alignment = listOf(
                AlignMeasurement(
                    Alignment.LEFT,
                    measurement("25%")
                ),
                AlignMeasurement(
                    Alignment.TOP,
                    measurement("25%")
                )
            )
        )
    )
}