package me.honkling.sight.ui.style

fun String.toMeasurementType(): MeasurementType {
    return MeasurementType.values().find { it.label == this }
        ?: throw IllegalStateException("Tried to get measurement type of invalid input")
}