package org.example

fun main() {
    for (i in 9 downTo 1) {
        for (q in 1..9) {
            print("${i * q}\t")
        }
        println()
    }
}
