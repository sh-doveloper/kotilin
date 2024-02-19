package com.example.kotlin

fun main() {
    // 범위 연산자
    for (i in 0..3) {
        println(i)
    }

    // until은 뒤에 온 숫자는 포함하지 않는다.
    for (i in 0 until 3) {
        println(i)
    }

    // step : 특정 숫자만큼 증가되도록 사용
    for (i in 0..6 step 2) {
        println(i)
    }

    // downTo 값을 반복하면서 감소시킨다.
    for (i in 3 downTo 1) {
        println(i)
    }

    // 배열처리
    val numbers = arrayOf(1, 2, 3)
    for (i in numbers) {
        println(i)
    }
}

