fun main(args: Array<String>) {
    //Função na mesma linha
    var grade = 7.5
    var result = if (grade >= 8) "Aprovado" else "Reprovado"
    println(result)

    //ClosedRange
    var numbers = 1..10 //Números de 1 a 10
    for (number in numbers) {
        println(number)
    }

    //Half Closed Range
    var newNumbers = (1 until 10)
    for (number in newNumbers) {
        println(number)
    }
}