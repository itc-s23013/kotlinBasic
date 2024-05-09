package org.example

fun main(args: Array<String>) {
    val a: IntRange = 0..6
    val b: IntRange = 7..12
    val c: IntRange = 13..15
    println(a)
    println(b)
    println(c)

    val age2: Int = 10

    val range21: IntRange = 0..6
    val range22: IntRange = 7..12
    val range23: IntRange = 13..15

    val flag21 = age2 in range21
    val flag22 = age2 in range22
    val flag23 = age2 in range23

    println("${age2} 都市の子供修学旅行 $flag21")
    println("${age2} 新幹線は早い $flag22")
    println("${age2} 電車の中のドア $flag23")

    println("----10.3----")
    val flag31 = age2 !in range21
    val flag32 = age2 !in range22
    val flag33 = age2 !in range23
    println("${age2}あ$flag31")
    println("${age2}い$flag32")
    println("${age2}う$flag33")

    println("----10.4----")
    val rangeA : LongRange = 0..10_000_000_000L
    val rangeB : CharRange = 'A'..'E'
    val rangeC: CharRange = 'あ'..'お'

    val flagA = 500 in rangeA
    val flagB = 'D' in rangeB
    val flagC = 'え' in rangeC

    println("flagA = $flagA")
    println("flagB = $flagB")
    println("flagC = $flagC")

    println("----10.a----")
    val rangeD: IntRange = 0 until 6
    val rangeE: IntRange = 0..6
    println(rangeD)
    println(rangeE)
}