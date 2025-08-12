package main.kotlin.model

import java.time.LocalDate
import java.time.Period

open class Person {
    var name: String = ""
    var dateOfBirth: LocalDate = LocalDate.of(2000, 5, 10)
    var weight: Double = 0.0
    var height: Double = 0.0

    val age: Int
        get() {
            return Period.between(dateOfBirth, LocalDate.now()).years
        }

    open fun showData() {
        println("Nome: ${name} / Data de nascimento: ${dateOfBirth} / " +
                "Peso: ${weight} / Altura: ${height} / Idade: ${age}")
    }
}