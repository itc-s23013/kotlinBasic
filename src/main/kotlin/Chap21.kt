package org.example

fun main(args: Array<String>) {
    val answer: Int = getTimes(2, 3)
    println(answer)

//21.1.../
    // fun getThreeTimes(value: Int): Int {
    //       return value * 3
    run {
        val answer: Unit = getTimes(2, 3, 4)
        println("変数 answer:$answer")
    }
}
// 21.5
fun getThreeTimes(value: Int) = value * 3

// 21.8
fun getTimes(x: Int, y: Int) = x * y
//21.11
fun getTimes(x: Int, y: Int, z: Int):Unit {
    println("パラメータとして$x　と　 $y 　と$z　を受け取りました")
    println("これらの値を全部掛け算した答えは ${x * y * z}")
    //21.13
    fun printTimes(x: Int, y: Int, z: Int) {
        println("------------------------------")
        println("パラメータとして$x と$y と$z を受け取りました")
        println("これらの値をかけ合わせた答えは ${x * y * z}です。")
        println("------------------------------")
    }
}