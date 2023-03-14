package me.honkling.sight

fun main() {
    val (amount, type) = Regex("^(\\d+)(px|%)").matchEntire("30px")!!.destructured
    println("$amount $type")
}