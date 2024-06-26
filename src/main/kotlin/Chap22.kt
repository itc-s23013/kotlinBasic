package org.example

fun main(args: Array<String>) {
    //println("----22.1----")
    //val text = "あいうえお"
    //val number = text.toInt()
    //println(number)
    run {
        println("----22.3----")
        print("input: ")
        val text = readln()
        try{
            var number = text.toInt()
            println("number = $number")
        }catch (e: NumberFormatException){
            println("「${text}」という文字は整数値に変換できません")
        }
    }
    run {
        println("----22.4----")
        try {
            val number = args[0].toInt()
            println("number = $number")
        } catch (e:NumberFormatException) {
            println("「${args[0]}」という文字は整数値に変換できません")
        } catch (e:ArrayIndexOutOfBoundsException) {
            println("文字を入力してください")
        } catch (e: Exception){
            println("想定外")
        }
    }
    run {
        println("----22.7+----")
        print("inpput: ")
        val text = "readln()"
        try {
            val number = text.toInt()
            println("number = $number")
        } catch (e: ArrayIndexOutOfBoundsException) {
            println("文字を入力してください")
        } finally {
            println("ありがとう")
        }
    }
}
