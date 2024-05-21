package com.example.chap27

fun main(args: Array<String>) {
    run {
        println("----27.2----")
        val car = Car()
        car.drive(5.0)
        car.drive(10.0)
    }
    run {
        println("----27.4----")
        val car = Ferrari()
        car.drive(5.0)
        car.drive(10.0)
    }
    run {
        println("----27.5----")
        val car = Ferrari5("青")
        car.drive(5.0)
        car.drive(10.0)
    }
}
open class Car() {
    var distance = 0.0
    open fun drive(d: Double) {
        distance = distance + d
        println("車が${d}km走りました")
        println("マイレージは${distance}kmになりました。")
    }
}
open class Car5 (val color : String) {
    var distance = 0.0
    open fun drive(d: Double) {
        distance = distance + d
        println("${color}の車が${d}km走りました")
        println("マイレージは${distance}kmになりました。")
    }
}

class Ferrari() : Car()
class Ferrari5 (color: String) : Car5(color)