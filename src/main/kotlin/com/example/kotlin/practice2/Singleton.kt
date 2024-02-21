package com.example.kotlin.practice2

import java.time.LocalDateTime

// object라고 선언해서 singleton을 구현함
object DateTimeUtils {
    val now: LocalDateTime
        get() = LocalDateTime.now()

    const val DEFAULT_FORMAT = "YYYY-MM-DD"
    fun same(a: LocalDateTime, b: LocalDateTime): Boolean {
        return a == b
    }

}

fun main() {
    // 싱글톤
    println(DateTimeUtils.now)
    println(DateTimeUtils.now)
    println(DateTimeUtils.now)

    println(DateTimeUtils.DEFAULT_FORMAT)

    val now = LocalDateTime.now()
    println(DateTimeUtils.same(now, now))

    // 동반객체
    println(MyClss.a)
    println(MyClss.newInstance())
    println(MyClss.a)
    println(MyClss.newInstance())
}

class MyClss {

    // 동반객체
    companion object {
        val a = 1234
        fun newInstance() = MyClss()
    }
}
