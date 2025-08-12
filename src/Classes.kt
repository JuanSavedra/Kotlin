import main.kotlin.model.Employee
import main.kotlin.model.Person
import main.kotlin.model.Product
import java.time.LocalDate

fun main(args: Array<String>) {
    //Pessoa
    val person = Person()
    person.name = "Juan Savedra"
    person.dateOfBirth = LocalDate.of(2006, 4, 15)
    person.weight = 65.3
    person.height = 1.75

    person.showData()

    //Produto
    val product = Product("Mouse", 119.90)
    product.showData()

    //Funcionário
    val employee = Employee()
    employee.name = "Vitor Savedra"
    employee.dateOfBirth = LocalDate.of(2006, 4, 15)
    employee.weight = 65.3
    employee.height = 1.75
    employee.role = "Software Engineer Senior"
    employee.salary = 10000.00

    employee.showData()
}