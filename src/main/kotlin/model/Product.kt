package main.kotlin.model

class Product constructor(var name: String, var price: Double) {
    fun showData() {
        println("Nome do produto: ${name} / Preço do produto: ${price}")
    }
}