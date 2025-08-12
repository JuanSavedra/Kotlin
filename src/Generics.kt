fun main(args: Array<String>) {
    fun<T> swap(a: T, b: T): Pair<T, T> { //O 'T' indica que pode ser qualquer tipo de valor
        return Pair(b, a)
    }

    val result = swap("Juan", 32);

    println(result)
}