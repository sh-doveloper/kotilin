package com.example.kotlin.practice2

class MyGenerics<out T>(val t: T) {

}

class Bag<T> {
    fun saveAll(
        to: MutableList<in T>,
        from: MutableList<T>,
    ) {
        to.addAll(from);
    }
}

fun main() {
    // 제네릭을 사용한 클래스 인스턴스를 만들려면 타입아규먼트를 제공
    // 타입추론이 가능한 경우는 생략 가능, 즉 인자에 String 값이 들어가 있으면 컴파일러가 인식함
//    val generics = MyGenerics<String>("테스트")
//    val generics = MyGenerics("테스트")

    // 변수의 타입에 제네릭을 사용한 경우
    val list1: MutableList<String> = mutableListOf()

    // 타입아규먼트를 생성자에서 추가
    val list2 = mutableListOf<String>()

    val list3: List<*> = listOf("테스트")
    val list4: List<*> = listOf(1, 2, 3, 4)

    // 변성
    // PECS(producer-extends, consumer-super)
    // 공변성은 자바 제네릭의 extends 코를린에서 out
    // 반공변성은 자바 제네릭의 extends 코틀린에서 in
    val generics = MyGenerics("테스트")
    val charGenerics: MyGenerics<CharSequence> = generics

    val bag = Bag<String>()
    bag.saveAll(mutableListOf<CharSequence>("1", "2"), mutableListOf<String>("3", "4"))

}