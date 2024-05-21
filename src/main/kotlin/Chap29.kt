package com.example.chap29


fun main(args: Array<String>) {
    val car = Ferrari("青")
    val car2 = Priusu("黒")
    driveByCar(car)
    driveByCar(car2)
}

fun driveByFerrari(car: Ferrari) {
    car.drive(100.0)
}

//29.5
fun driveByCar(car: Car) {
    car.drive(100.0)
}

open class Car(val color: String) {
    var distance = 0.0
    open fun drive(d: Double) {
        distance += d
        println("${color}の車が${d}走っています")
        println("その結果、マイレージは${distance}キロになりました")
    }
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