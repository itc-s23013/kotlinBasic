package org.example

fun main(args: Array<String>) {
    println("Enter the score:")
    val score = readLine()?.toInt()

    if (score != null) {
        val grade = when {
            score in 0..59 -> "D"
            score in 60..69 -> "C"
            score in 70..79 -> "B"
            score in 80..100 -> "A"
            else -> "エラー"
        }
        println("成績は $grade です。")
    } else {
        println("有効な数字を入力してください。")
    }

    //成績判定
    //0 ~ 59 は D
    //60 ~ 69 は　C
    //70 ~ 79 は　B
    //80 ~ 100 は　A
    //それ以外はエラーと出力
}