package org.example

fun main(args: Array<String>) {
    run {
        val map: Map<String, String> = mapOf("Pen" to "ペン", "Apple" to "アップル", "Pineapple" to "パイナップル")
        val value1 = map["Pen"]
        val value2 = map["Apple"]
        val value3 = map["Pineapple"]
        val value4 = map["Pen"]
        println("${value1} ${value2} ${value3} ${value4}")
    }

    run {
        println("----19.2----")

        val map: Map<Char, Int> = mapOf(
            'a' to 1,
            'b' to 2,
            'c' to 3,
            'z' to 26
        )
        println(map['a'])
        println(map['b'])
        println(map['c'])
        println(map['z'])
    }

    run {
        println("----19.3----")
        val map: Map<Int, Char> = mapOf(1 to 'a', 2 to 'b', 3 to 'c', 26 to 'z')
        println(map[1])
        println(map[2])
        println(map[3])
        println(map[26])
    }

    run {
        println("----19.4----")
        val map = mutableMapOf<String, String>()
        map.put("Pen", "ペン")
        map["Apple"] = "アップル"
        map += "Pineapple" to "パイナップル"
        val value1 = map["Pen"]
        val value2 = map["Apple"]
        val value3 = map["Pineapple"]
        val value4 = map["Pen"]
        println("${value1} ${value2} ${value3} ${value4}")
    }

    run {
        println("----19.5----")
        val map = mutableMapOf<String, String>()
        map.put("Pen", "ペン")
        map["Apple"] = "アップル"
        map += "Pineapple" to "パイナップル"
        val value1 = map["Pen"]
        val value2 = map["pineapple"]
        val value3 = map["Apple"]
        map -= "Pen"
        val value4 = map["Pen"]
        println("${value1}, ${value2}, ${value3}, ${value4}")
    }

    run {
        println("----19.6----")
    }
}
