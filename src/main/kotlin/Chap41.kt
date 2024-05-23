package com.example.chap41

fun main(args: Array<String>) {
    run {
        println("----41.1----")
        val box1 = Box<String>()
        val box2 = Box<Int>()
        box1.setValues("文字列ですよ","あいうえお")
        box2.setValues("整数ですよ",1000)
        box1.printValues()
        box2.printValues()
    }
}

class Box<T> {
    var label: String? = null
    var content: T? = null

    fun setValues(labal: String, content: T) {
        this.label = labal
        this.content = content
    }

    fun printValues() {
        println("$label : $content")
    }
}