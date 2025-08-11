fun main(args: Array<String>) {
    //String
    var courseName = "Análise e desenvolvimento de sistemas"
    println(courseName)

    courseName = "Ciência da Computação"
    println(courseName)

    //Char
    var letter = 'A'
    println()

    //Pair (Armazena duas variáveis de diferentes valores)
    var (code, description) = Pair(100, "Mouse")
    println(code)
    println(description)

    var product: Pair<Int, String> = Pair(200, "Keyboard")
    println(product.first)
    println(product.second)
    println(product)

    //Inteiros
    var age: Byte = 19 //Indicando que é um tipo Byte (só aceita números inteiros)
    println(age)

    age = 20
    println(age)

    //Variáveis constantes
    val pi = 3.14
    println(pi)

    //Tipos numéricos
    /*
    Long - 64 bits (Inteiro)
    Int - 32 bits (Inteiro)
    Short - 16 bits (Inteiro)
    Byte - 8 bits (Inteiro)
    Double - 64 bits (Decimal)
    Float - 32 bits (Decimal)
     */

    println(Long.MAX_VALUE)
    println(Int.MAX_VALUE)
    println(Short.MAX_VALUE)
    println(Byte.MAX_VALUE)
    println(Double.MAX_VALUE)
    println(Float.MAX_VALUE)

    //Boolean
    var isApproved = true
    println(isApproved)

    //Null safety
    var nullType: Int? = null //Permite atribuir o valor de null
    println(nullType)

    nullType = 0
    println(nullType)
}