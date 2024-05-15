package org.exampl

import kotlin.time.measureTime

fun main(args: Array<String>) {
    run {
        println()
    }
    run {
        println("----18.2+----")
        val s = mutableSetOf("あ", "い", "う", "え", "お")
        s += "港"
        s += "区"
        s += "女"
        s += "子"
        println(s)
    }

    val charList = 'a'..'z'
    val seachCharList = mutableListOf('z','x','c','v','b','n','m')
    val seachCharset = mutableSetOf('z','x','c','v','b','n','m')
    val count = 1_000_000_000_000L
    val listTime = measureTime {
        for (i in 0..<count) {
            val target = charList.shuffled()[0]
            println("「${target}」は存在する？ : ${target in seachCharList}")
        }
    }
    val setTime = measureTime {
        for (i in 0..<count) {
            val target = charList.shuffled()[0]
            println("「${target}」は存在する？ : ${target in seachCharset}")
        }
    }
    println("Listでかかった時間: $listTime")
    println("setでかかった時間: $setTime")
}