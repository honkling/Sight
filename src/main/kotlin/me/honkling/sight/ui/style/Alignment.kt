package me.honkling.sight.ui.style

enum class Alignment {
    LEFT,
    RIGHT,
    TOP,
    BOTTOM;

    fun isHorizontal(): Boolean {
        return this == LEFT || this == RIGHT
    }
}