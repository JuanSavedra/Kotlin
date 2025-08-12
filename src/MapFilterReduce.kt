fun main(args: Array<String>) {
    //Filter (Filtra itens específicos)
    val numbers = listOf(1, 2, 3, 4, 5)
    val names = listOf("Juan", "Vitor", "Daniela", "Alexandre", "Jay")

    val pairs = numbers.filter {
        it % 2 == 0
    }

    val namesWithInitialJ = names.filter {
        it.startsWith("J")
    }

    println(pairs)
    println(namesWithInitialJ)

    //Map (Mapeia todos os itens)
    val namesUppercase = names.map {
        it.uppercase()
    }

    println(namesUppercase)

    //Reduce (Reduz para apenas um valor)
    var sumOfAllNumbers = numbers.reduce{current, next ->
        current + next
    }
}