package com.example.kotlin.practice

enum class PaymentStatus(val label: String) : Payable {
    UNPAID("미지급") {
        override fun isPayable(): Boolean = true
    },
    PAID("지급") {
        override fun isPayable(): Boolean = false
    },
    FAILED("지급실패") {
        override fun isPayable(): Boolean = false
    },
    REFUNDED("환불") {
        override fun isPayable(): Boolean = false
    };
}

interface Payable {
    abstract fun isPayable(): Boolean

}

fun main() {
    println(PaymentStatus.UNPAID.label)

    if (PaymentStatus.UNPAID.isPayable()) {
        println("결제지급 가능상태")
    }

    val paymentStatus = PaymentStatus.valueOf("PAID")
    println(paymentStatus.label)

    if (paymentStatus == PaymentStatus.PAID) {
        println("결제지급 완료상태")
    }

    for (status in PaymentStatus.values()) {
        // name : enum명 그대로 출력, ordinal : 순서
        println("${status}, ${status.name}, ${status.label}, ${status.isPayable()} : ${status.ordinal}")
    }
}