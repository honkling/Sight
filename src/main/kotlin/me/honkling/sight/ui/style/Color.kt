package me.honkling.sight.ui.style

private val HEX_REGEX = Regex("#?[0-9a-fA-F]{6}")

data class Color(val hex: String, val opacity: Int = 100) {
    init {
        if (!hex.matches(HEX_REGEX))
            throw IllegalArgumentException("Color was passed invalid hex ('$hex')")
    }

    fun toInt(): Int {
        val scaledOpacity = ((opacity / 100.0) * 255).toInt()
        return (scaledOpacity.toString(16) + hex
            .replace("#", ""))
            .toLong(16)
            .toInt()
    }
}
