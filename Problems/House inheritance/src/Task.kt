fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt()

    val house: House

    house = when {
        rooms <= 1 -> Cabin(rooms, price)
        rooms in 2..3 -> Bungalow(rooms, price)
        rooms == 4 -> Cottage(rooms, price)
        rooms in 5..7 -> Mansion(rooms, price)
        else -> Palace(rooms, price)
    }

    println(totalPrice(house))
}

open class House(val rooms: Int, val price: Int, val coefficient: Double = 0.0)

class Cabin(rooms: Int, price: Int) : House(rooms, price, 1.0)
class Bungalow(rooms: Int, price: Int) : House(rooms, price, 1.2)
class Cottage(rooms: Int, price: Int) : House(rooms, price, 1.25)
class Mansion(rooms: Int, price: Int) : House(rooms, price, 1.4)
class Palace(rooms: Int, price: Int) : House(rooms, price, 1.6)

fun totalPrice(house: House): Int {
    return (house.price.coerceIn(0, 1_000_000).toDouble() * house.coefficient).toInt()
}
/*
fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt()
    val house = House(rooms, price)
    println(totalPrice(house))
}
class House(val rooms: Int, val price: Int)
fun totalPrice(house: House): Int {
    var result = 0
    when {
        house.rooms < 0 || house.rooms == 1 || house.rooms == 0 -> {
            result = house.price
        }
        house.rooms == 2 || house.rooms == 3 -> {
            result = (house.price * 1.2).toInt()
        }
        house.rooms == 4 -> {
            result = (house.price * 1.25).toInt()
        }
        house.rooms == 5 || house.rooms == 6 || house.rooms == 7 -> {
            result = (house.price * 1.4).toInt()
        }
    }
    return result
}
 */
