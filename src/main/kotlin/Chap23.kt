package org.example

fun main(args: Array<String>) {
run {
    println("----23.4----")
    var p = Person3()
    }
    run {
        println("----23.5----")
        var p = Person3()
        p.name = "DIO"
        p.age = "パンを食べた回数"
        p.greet()
    }
    run {
        println("----23.6----")
        val p1 = Person3()
        p1.name = "jojo"
        p1.age = "1"

        val p2 = Person3()
        p2.name = "spedwagon"
        p2.age = "333"

        val p3 = Person3()
        p3.name = "プッチ"
        p3.age = "21"

        p1.greet()
        p3.greet()
        p2.greet()
    }
}

class Person1

class Person2{
    var name = ""
    var age = 0
}

class Person3{
    var name = "DIO"
    var age = "パンを食べた回数"

    fun greet() {
        println("俺の名前は ${name}, だ！ 人を殴った回数は ${age}だ！")
    }
}