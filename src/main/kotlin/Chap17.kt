package org.example

fun main(args: Array<String>) {
    println("----17.2----")
    val a2: List<Int> = listOf(1000, 2000, 1500)

    println("一年目の時給は${a2[0]}円です。")
    println("一年目の時給は${a2[1]}円です。")
    println("一年目の時給は${a2[2]}円です。")

    for (money in a2) {
        println("時給は${money}円です。")
    }

    for ((index, money) in a2.withIndex()) {
        println("${index + 1}年目の時給は${money}円です。")
    }
    println("----17.3e----")
    val a3 = listOf<Boolean>(true, false, true)
    val b3 = listOf<Byte>(2, 4, 8)
    val c3 = listOf<Short>(100, 101, 102)
    val d3 = listOf<Int>(1000, 1200, 1500)
    val e3 = listOf<Long>(100_000L, 120_000L, 150_000L)
    val f3 = listOf<Float>(1.0f, 1.1f, 1.2f)
    val g3 = listOf<Double>(1.0, 10.0, 100.0)
    val h3 = listOf<String>("こんにちは", "kotlin", "よろしく")

    println("----17.7----")
    val a7: MutableList<String> = mutableListOf("こんにちは", "kotln", "よろしく",)
    for ((i, x) in a7.withIndex()) {
        println("$i: $x")
    }
    a7.add("どうぞ")
    a7.add("お願いします")
    for ((i, x) in a7.withIndex()) {
        println("$i: $x")
    }

    println("---17.9---")
    val a10: MutableList<String> = mutableListOf("こんにちは", "Kotlin" ,"よろしく")
    a10.removeAt(2)
    for((i,x) in a10.withIndex()) println("${i} : ${x}")

}