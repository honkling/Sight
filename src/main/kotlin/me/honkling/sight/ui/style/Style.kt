package me.honkling.sight.ui.style

private val EMPTY_MEASUREMENT = Measurement(0, MeasurementType.PIXELS)

data class Style(
    val width: Measurement = EMPTY_MEASUREMENT,
    val height: Measurement = EMPTY_MEASUREMENT,

    val alignment: List<AlignMeasurement> = emptyList(),

    val backgroundColor: Color = Color("#000000", 0)
)