package org.example

fun main(args: Array<String>) {
    val x = "hello"
    when (x) {
        "Good Morning" -> println("おはよう御座います")
        "Hello"        -> println("こんにちは")
        "Good Evening" -> println("こんばんわ")
        else           -> println("どうも！")
    }
    println("----12.2----")
    val x2 = 2
    when (x2) {
        //1 -> println("ワン")
        //2 -> println("ツー")
        1,2 -> {
            println("ワンかツーのどちらか")
            println("こんにちは")
        }
        3 -> {
            println("スリー")
            println("ありがとうございました")
        }
        else -> {
            println("ワン、ツー、スリー以外の数字です")
            println("さようなら")
        }
    }

    println("----12.5----")
    val x5 = 2
    val message5 = when (x5) {
        1 -> "ワン"
        2 -> "ツー"
        3 -> "スリー"
        else -> "ワン、ツー、スリー以外の数字です"
    }
    println(message5)

    println("----12,8----")
    val x8 = 2
    when {
        (x8 == 1 || x8 == 2)
        -> println()
    }
}
