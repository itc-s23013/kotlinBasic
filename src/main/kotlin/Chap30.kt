package com.example.chap30

fun main(args: Array<String>) {
    val car1 = Ferrari("青")
    val car2 = Priusu("赤")
    //val car3 = Car("黒")
    car1.drive(10.0)
    car2.drive(10.0)
    //car3.drive(10.0)
}

abstract class Car (val color: String) {
    var distance = 0.0
    abstract fun drive(d: Double)
}

class Ferrari(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のGTRが走っています")
        println("1000kmを超えたぞ!!!!")
        println("マイレージは${distance}キロになったぞ!!!!")
    }
}

class Priusu(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のチャージャーが走っています!!")
        println("すごいスピードですね")
        println("マイレージは${distance}キロを超えたぞ！！")
        println("チャージャーは手入れをしたら1000年は走ると言われています")
    }

}

class Xbee(color: String) : Car(color) {
    override fun drive(d: Double){
        distance += d
        println("${color}のクロス日ーが走りました")
        println("マイレージは${distance}キロになりました")
    }
}