package com.example.kotlin.practice2

data class Person(val name: String, val age: Int)

fun main() {
    val person1 = Person(name = "tony", age = 12)
    val person2 = Person(name = "tony", age = 12)
    println(person1.equals(person2))

    // equals가 true이면 hashcode도 true가 되어야한다.
    val set = hashSetOf(person1)
    println(set.contains(person2))

    println(person1.toString())

    // copy 그대로.
    val person3 = person1.copy()
    println(person3.toString())

    // copy 값을 변경하여
    val person4 = person1.copy(name = "strange")
    println(person4.toString())

    // component 사용
    println("이름=${person4.component1()}, 나이=${person4.component2()}")

    // 구조분해할당
    val (name, age) = person1
    println("이름=${name}, 나이=${age}")
}