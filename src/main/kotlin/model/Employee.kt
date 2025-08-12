package main.kotlin.model

class Employee: Person() {
    var role: String = ""
    var salary: Double = 0.0

    override fun showData() {
        println("Nome: ${name} / Data de nascimento: ${dateOfBirth} / " +
                "Peso: ${weight} / Altura: ${height} / Idade: ${age} / Cargo: ${role} / Salário: ${salary}")
    }
}