package com.example.chap37

import kotlin.random.Random

fun main(args: Array<String>) {
    run {
        println("----37.1----")
        val p = ::calculatePlus
        val m = ::calculateMinus
    }

    run {
        println("----37.2----")
        val p = ::calculatePlus
        val m = ::calculateMinus
        printRandomValuesCalculation2(m)
        printRandomValuesCalculation2(p)
    }

    run {
        println("----37.3----")
        val p = ::calculateMinus
        val m = ::calculatePlus
        printRandomValuesCalculation3(p)
        printRandomValuesCalculation3(m)
    }

    run {
        println("----37.4----")
        val p = fun(x: Double, y: Double): Double = x + y
        val m = fun(x: Double, y: Double): Double = x - y
        printRandomValuesCalculation4(p)
        printRandomValuesCalculation4(m)
    }

    run {
        println("----37.6----")
        val calculator1 = getCalculatot("+")
        val calculator2 = getCalculatot("-")
        val result1 = calculator1(10.0, 2.0)
        val result2 = calculator2(10.0, 2.0)
        println(result1)
        println(result2)
    }
}

fun calculatePlus(x: Double, y: Double)  = x + y

fun calculateMinus(x: Double, y: Double)  = x - y

fun printRandomValuesCalculation2(
    calculator: (Double, Double) -> Double){
    val x = Random.nextDouble()
    val y = Random.nextDouble()
    val result = calculator(x, y)
    println("$x と$y　の計算結果は $result　です")
}

fun printRandomValuesCalculation3(
    calculator: (Double, Double) -> Double){
    val x = Random.nextDouble()
    val y = Random.nextDouble()
    val result = calculator(x, y)
    println("$x と$y　の計算結果は $result　です")
}

fun printRandomValuesCalculation4(calculator: (Double, Double) -> Double) {
    val x = Math.random()
    val y = Math.random()
    val result = calculator(x, y)
    println("計算結果は${result}です。")
}

fun getCalculatot(type: String) : (Double,Double) -> Double {
    val p = fun(x: Double, y: Double) = x + y
    val m = fun(x: Double, y: Double) = x - y
    return when (type) {
        "+" -> p
        else -> m
    }
}