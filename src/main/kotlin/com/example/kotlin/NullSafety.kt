package com.example.kotlin

fun getNullStr(): String? = null

fun getLengthIfNotNull(string: String?) = string?.length ?: 0


fun main() {

    val nullableString = getNullStr()

    val nullableStringLength = nullableString?.length ?: "null인 경우 반환".length
    println(nullableStringLength)

    val length = getLengthIfNotNull(null)
    println(length)

//    throw NullPointerException()

    val c: String? = null
    val d = c!!.length // 컴파일러에게 c가 안전하다고 확언해주는것 -> 사용을 많이 하지는 않음

    // 자바 소스를 직접 호출해서 사용할때는 null check를 할 수 없다.
    // 엘비스 연산자늘 함께 써서 nullable 가능성을 염두해두고 체크를 해야한다.

    // nullable 불가
//    val a: String = null
//    var b: String = "123"
//    b = null

//    var a: String? = null
//    a?.length
//    println(a?.length)
//
//    val b: Int = if (a != null) a.length else 0
//    println(b)
//
//    // 엘비스 연산자
//    val c = a?.length ?: 0
//    println(c)
}