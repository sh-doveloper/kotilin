package com.example.kotlin.practice

// 탑레벨에 위치한 변수
var x = 4
fun main() {

    x += 1
    println(x)

    val a: Int = 1
    println(a)

    // 지연할당 : 타입을 필수적으로 명시해줘야함
    val c: Int
    c = 3

    //val(value) : read only, final과 유사
    //var(variable) : 재할당 가능

//    val e : String = "Hello"
//    e = "a"

    // var라고 하더라도 한번 정해진 타입은 변경이 불가능하다.
//    var f = 123
//    f = "123"

}



