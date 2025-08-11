fun main(args: Array<String>) {
    var states = arrayOf("São Paulo", "Rio de Janeiro", "Santa Catarina");
    println(states[0])
    println(states[1])
    println(states[2])

    states[1] = "Bahia"
    println(states[1])

    //Tipando o Array
    var names = arrayOf<String>("Juan", "Vitor")
    println(names[0])
    println(names[1])

    //Verificando se está vazia
    var haveStates = states.isEmpty()
    println(haveStates)

    //Verificando o tamanho do array
    println(states.size)

    //Adicionando elementos
    var numbers = ArrayList<Int>()
    println("Quantidade de números: " + numbers.size)
    numbers.add(1)
    numbers.add(2)
    numbers.add(3)

    println("Quantidade de números: " + numbers.size)

    //Verificando se contém algum elemento
    println(numbers.contains(1))
    println(numbers.contains(0))

    //Visualizando elementos da lista
    println(numbers)

    //Removendo elementos da lista
    numbers.remove(1)
    println(numbers)

    //Outras funções da lista
    var myMovies = ArrayList<String>()
    myMovies.addAll(listOf( //Adicionando diversos elementos em sequência
        "Matrix",
        "Vingadores",
        "Jurassic Park",
        "De volta para o futuro"
    ))

    myMovies.count() //Quantidade de elementos na lista

    for (movie in myMovies) { //Percorrendo a lista de filmes
        println(movie)
    }

    var myWifeMovies = ArrayList<String>()
    myWifeMovies.addAll(listOf(
        "Para todos os garotos que eu já amei",
        "Extraordinário",
        "Interestelar"
    ))

    var allMovies = myMovies + myWifeMovies

    //HashSet (Manipulando uma lista onde não permitem itens repetidos)
    var countries = HashSet<String>()
    countries.addAll(listOf(
        "Brasil",
        "Estados Unidos",
        "China"
    ))

    println(countries)

    var weights = setOf(45.9, 47.9, 63.8, 74.9) //Não é possível adicionar elementos a mais com um add
    println(weights)

    //HashMap
    var products = HashMap<String, Double>()
    products.putAll(mapOf(
        Pair("Teclado", 149.9),
        Pair("Mouse", 119.9),
        Pair("Monitor", 789.9)
    ))

    println(products)

    products.remove("Mouse") //Removendo todos os produtos com essa chave
    products.remove("Mouse", 119.9) //Removendo um produto específico

    println(products.get("Teclado")) //Resgatando um valor específico
}