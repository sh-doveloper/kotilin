package com.example.kotlin.practice2

import java.util.*
import java.util.stream.Collectors

fun main() {

    // immutable
    val currencyList = listOf("달러", "유로", "원")

    // mutable
//    val mutableList = mutableListOf<String>()
//    mutableList.add("달러")
//    mutableList.add("유로")
//    mutableList.add("원")

    val mutableList = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }

    // immutable set
    val numberSet = setOf(1, 2, 3, 4)

    // mutable set
    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2)

    // mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1
    mutableNumberMap["two"] = 2
    mutableNumberMap["three"] = 3

    // buildList 안에서는 mutable, return은 immutable
    val numberList: List<Int> = buildList {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    // linkedList
    val linkedList = LinkedList<Int>().apply {
        addFirst(1)
        add(2)
        addLast(3)
    }

    // linkedList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    // iterator
    val iterator = currencyList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    for (currency in currencyList) {
        println(currency)
    }

    currencyList.forEach {
        println(it)
    }

    // for loop -> map
    val lowerList = listOf("a", "b", "c")
//    val upperList = mutableListOf<String>()
//
//    for (lowerString in lowerList) {
//        upperList.add(lowerString.uppercase())
//    }

    val upperList = lowerList.map { it.uppercase() }

    println(upperList)

//    val filteredList = mutableListOf<String>()
//    for (upperString in upperList) {
//        if ("A".equals(upperString) || "C".equals(upperString)) {
//            filteredList.add(upperString)
//        }
//    }

//    val filteredList = upperList.filter { it == "A" || it == "C" } // 터미널 오퍼레이터가 존재하지 않음
    // java로 바꾸어보면...
    val filteredList =
        upperList.stream().filter { it == "A" || it == "C" }.collect(Collectors.toList()) // 터미널 오퍼레이터가 존재하지 않음
    println(filteredList)

    // java의 stream과 유사한 동작을 하는 기능이 존재
    // 아래와 같이 filter 체인이 여러개인 경우, filter를 할때마다 객체 생성이 되어 OOM 발생 가능성이 존재
    // 아래와 같이 asSequence 를 쓰고 터미널 오퍼레이션을 사용해서 객체를 한번만 생성하게 함
    val filteredList2 =
        upperList
            .asSequence()
            .filter { it == "A" || it == "C" }
            .filter { it == "B" }
            .filter { it == "C" }
            .filter { it == "A" }
            .toList()
    // 터미널 오퍼레이터가 존재하지 않음
    println(filteredList)

}
