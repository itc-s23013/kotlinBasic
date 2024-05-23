package com.example.chap35

fun main(args: Array<String>) {
    run {
        println("----35.1----")
        val p1 = Person("エイト", 1234)
        val p2 = Person("エイト", 1234)
        if (p1 == p2) {
            println("二人は同一人物")
        } else {
            println("二人は別人")
        }
    }

    run {
        println("----35.2----")
        val p1 = BrokenPerson("タケシ",1234)
        val p2 = BrokenPerson("ケンタ",5678)
        if (p1 == p2) {
            println("二人は同一人物")
        } else {
            println("二人は別人")
        }
    }

    run {
        println("----35.3----")
        val p1 = BrokenPerson("タケシ",1234)
        val p2 = BrokenPerson("タケシ",1234)
        if (p1 == p2) {
            println("二人は同一人物")
        } else {
            println("二人は別人")
        }
    }

    run {
        println("----35.10----")
        val p = Person2("タケシ",1234)
        println(p.toString())
    }
}

class Person(val name: String, val myNumber: Int)

data class BrokenPerson(val name: String, val myNumber: Int)

data class Person2(val name: String, val myNumber: Int)