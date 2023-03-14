package me.honkling.sight.ui.style

private val MEASUREMENT_REGEX = Regex("^(\\d+)(px|%)$")

fun measurement(input: String): Measurement {
    val (amount, type) = (MEASUREMENT_REGEX.matchEntire(input)
        ?: throw IllegalArgumentException("Passed invalid measurement '$input'")).destructured

    return Measurement(amount.toInt(), type.toMeasurementType())
}