package com.example.kotlin.practice

class Product(val name: String, val price: Int)

interface Wheel {
    fun roll()
}

interface Order {
    fun add(product: Product) {
        println("${product.name} 주문이 완료되었습니다.")
    }

    fun printId() = println("5678") // 상속받는 인터페이스 내에 동일한 시그니쳐 함수가 존재하면 상속받은 클래스에서 재구현을 필수요청한다.
}

interface Cart : Wheel {
    var coin: Int

    val weight: String
        get() = "20KG" // backing 필드를 사용할 수 없다.

    fun add(product: Product)

    // 인터페이스 내부에 함수가 존재할 수 있다
    fun rent() {
        if (coin > 0) {
            println("카드를 대여합니다.")
        }
    }

    override fun roll() {
        println("카트가 굴러갑니다.")
    }

    fun printId() = println("1234")

}

class MyCart(override var coin: Int) : Cart, Order { // 상속때는 Cart()와 같이 생성자를 같이 써줘야하지만 인터페이스는 생성자 없음
    override fun add(product: Product) {
        if (coin <= 0) println("코인을 넣어주세요.") else println("${product.name} 상품이 카드에 추가되었습니다.")

        // 주문하기
        super<Order>.add(product)
    }

    override fun printId() {
        super<Cart>.printId()
        super<Order>.printId()
    }


}

fun main() {
    val cart = MyCart(coin = 100)
    cart.rent()
    cart.roll()
    cart.add(Product(name = "장난감", price = 1000))
    cart.printId()

    val cart2 = MyCart(coin = 0)
    cart2.rent()
    cart2.roll()
    cart2.add(Product(name = "장난감", price = 1000))
    cart2.printId()
}