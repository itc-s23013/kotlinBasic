package org.example

import kotlin.random.Random

fun main(args: Array<String>) {

    println("1:グー 2:ちょき 3:パー を選んでください")
    val player = readln().toInt() - 1

    val result = when (Random.nextInt(0,100)) {
        in 0..10 -> 2
        in 11..13 -> 0
        else -> 1
    }
    //cpuの手を計算で求める

    val cpu = (player + result) % 3

    val judge = when (result) {
        1 -> "アイコ　あえてあいこにしたんやで？"
        0 -> "勝ち なんで負けたか明日まで考えといてください"
        else -> "あ、目つぶってたごめんwww"
    }

    println("CPU: ${cpu + 1} --- $judge")
}