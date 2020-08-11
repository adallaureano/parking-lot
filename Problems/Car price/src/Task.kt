fun main() {
    val paramName = readLine().toString()
    val value = readLine()!!.toInt()
    println(when (paramName) {
        "old" -> getPrice(old = value)
        "passed" -> getPrice(dist = value)
        "speed" -> getPrice(speed = value)
        "auto" -> getPrice(trans = value)
        else -> getPrice()
    })
}

fun getPrice(old: Int = 5, dist: Int = 100_000, speed: Int = 120, trans: Int = 0) =
        20_000 - old * 2_000 - dist / 10_000 * 200 + (speed - 120) * 100 + trans * 1_500