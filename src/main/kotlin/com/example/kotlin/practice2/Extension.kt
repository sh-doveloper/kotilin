package com.example.kotlin.practice2

// String 클래스에 내가 원하는 메서드를 추가하여 확장함수를 만듬.
// this 는 reciver, 수신자 객체
fun String.first(): Char {
    return this[0]
}

fun String.addFirst(char: Char): String {
    return char + this.substring(0)
}

class MyExample {
    fun printMessage() = println("클래스 출력")
}

// 확장하려는 대상의 동일한 시그니처가 없는 경우에만 가능함
// 오버로드인 경우에는 가능함
// 버전업이 되는 경우, 라이브러리를 우선하기때문에 의도하지 않은 버그가 생길수 있음
fun MyExample.printMessage(message: String) = println(message)

fun MyExample?.printNullOrNotNull() {
    if (this == null) println("null인 경우만 출력")
    else println("null이 아닌 경우만 출력")
}

fun main() {
    println("ABCD".first())
    println("ABCD".addFirst('Z'))
    MyExample().printMessage()

    var myExample: MyExample? = null
//    myExample?.printNullOrNotNull()

    // -> 안전연산자를 사용하지 않은 경우지만 컴파일 오류가 발생하지 않음
    // -> 왜냐하면 메서드 안에서 null에 대한 처리를 하고 있어, 컴파일이 절대 null pointer가 발생하지 않을것을 알고 있어 문제되지 않음.
    myExample.printNullOrNotNull()

    myExample = MyExample()
    myExample.printNullOrNotNull()
}