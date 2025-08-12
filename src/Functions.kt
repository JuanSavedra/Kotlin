fun main(args: Array<String>) {
    fun printHelloWorld() {
        println("Hello World!")
    }

    fun sum(number1: Int, number2: Int): Int {
        return number1 + number2
    }

    printHelloWorld()
    var result = sum(1 ,2)

    //Single-expression functions
    fun double(x: Int): Int = x * 2
    println(double(2))
}