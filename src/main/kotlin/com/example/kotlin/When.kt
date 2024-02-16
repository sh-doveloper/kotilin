package com.example.kotlin

fun main() {

    // when 구문
    val day = 2
    val result = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        5 -> "금요일"
        6 -> "토요일"
        7 -> "일요일"
        else -> "오류"
    }
    println(result)

    // else 생략 => enum 같은 경우가 가능
    when (getColor()) {
        Color.RED -> println("red")
        Color.GREEN -> println("green")
    }

    when (getNumber()) {
        0, 1 -> println("0 또는 1")
        else -> println("그 외")
    }

}

enum class Color {
    RED, GREEN
}

fun getColor() = Color.RED

fun getNumber() = 2