package com.example.kotlin.practice

// val로 선언하면 getter만 존재함
// var로 선언하면 getter 및 setter가 존재함
class Coffee(
//    val name: String,
//    val price: Int,
//    val brand: String,
    var name: String = "",
    var price: Int = 0,
    var iced: Boolean = false,
) {
    val brand: String get() = "스타벅스"

    var quantity: Int = 0
        set(value) {
            if (value > 0) {
                field = value // backing field : quantity로 선언하면 재귀호출이 되어서 에러가 발생함
            }
        }
}

fun main() {
    val coffee = Coffee()
    coffee.name = "아이스 아메리카노"
    coffee.price = 2000
    coffee.quantity = 1
    coffee.iced = true

    if (coffee.iced) {
        println("아이스")
    }
    println("${coffee.brand} ${coffee.name} 가격은 ${coffee.price} 수량은 ${coffee.quantity}")
}