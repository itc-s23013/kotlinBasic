package org.example

import kotlin.random.Random

fun main(args: Array<String>) {
    println("1:ぐー 2:ちょき 3:ぱー を選んでください")
    val player = readLine()?.toIntOrNull() ?: return

    val cpu = when (Random.nextInt(1, 4)) {
        1 -> "ぐー"
        2 -> "ちょき"
        3 -> "ぱー"
        else -> "" // Handle other cases if necessary
    }
    println("CPUが選んだのは: $cpu")
}
