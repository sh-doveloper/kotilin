package com.example.kotlin.practice

open class Dog() {
    open var age: Int = 0
    open fun bark() {
        println("멍멍")
    }
}

open class BullDog(override var age: Int = 1) : Dog() {
    //    final override fun bark() { 상속을 막기위해서는 final선언을 하면 된다.
    override fun bark() {
        super.bark()
//        println("컹컹")
    }
}

class ChildBullDog : BullDog() {
    override var age: Int = 0
    override fun bark() {
        super.bark()
    }
}

abstract class Developer {
    abstract var age: Int
    abstract fun code(language: String)
}

class BackendDeveploer(override var age: Int) : Developer() {
    override fun code(language: String) {
        println("I code with $language")
    }
}


fun main() {
    val dog = BullDog(age = 20)
    println(dog.age)
    dog.bark()

    var backendDeveploer = BackendDeveploer(age = 20)
    println(backendDeveploer.age)
    backendDeveploer.code("kotlin")
}