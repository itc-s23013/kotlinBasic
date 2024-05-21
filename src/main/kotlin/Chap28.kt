package com.example.chap28

import com.example.chap27.Car5

fun main(args: Array<String>) {
    run {
        println("----28.4----")
        val car = Ferrari("青")
        car.drive(100.0)
    }
    run {
        println("----28.5----")
        val car = Priusu("黒")
        car.drive(100000000000000.0)
    }
}

//28.2
class Ferrari(color: String) : Car5(color) {
    //28.3
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のGTRが走っています")
        println("1000kmを超えたぞ!!!!")
        println("マイレージは${distance}キロになったぞ!!!!")
    }
}

//28.5
class Priusu(color: String) : Car5(color) {
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のチャージャーが走っています!!")
        println("すごいスピードですね")
        println("マイレージは${distance}キロを超えたぞ！！")
        println("チャージャーは手入れをしたら1000年は走ると言われています")
    }
}