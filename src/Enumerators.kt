enum class SeatPosition(var seat: String) {
    aisle("corredor"),
    middle("meio"),
    window("janela")
}

enum class Month(var m: Int) {
    january(1), february(2), march(3), april(4), may(5), june(6), july(7),
    august(8), september(9), october(10), november(11), december(12)
}

fun main(args: Array<String>) {
    var name = "Juan Savedra"
    var passengerSeat: SeatPosition = SeatPosition.window
    var passengerMonth: Month = Month.january

    println("The passenger ${name} will sit by the ${passengerSeat}, in ${passengerMonth}.")
}