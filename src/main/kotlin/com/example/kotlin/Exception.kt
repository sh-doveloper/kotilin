package com.example.kotlin

fun main() {
    try {
//        Thread.sleep(1)
        throw Exception()
    } catch (e: Exception) {
        println("에러 발생")
    } finally {
        println("finally")
    }

    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("toInt 예외 발생")
    }
    println(a)

//    failFast("failFast 예외 발생!")

    println("이 메시지는 출력되나?")


    val b: String? = null
    val c: String = b ?: failFast("b is null") // 컴파일러가 c는 null 이 될 수 없다고 인식하여 ? 가 없이도 변수 선언 가능하다.

    println(c.length)
}

fun failFast(message: String): Nothing {
    throw IllegalArgumentException(message)
}