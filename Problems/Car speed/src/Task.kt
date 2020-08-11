fun main() {
    val carSpeed = readLine()!!.toInt()
    val limitOfRoad = readLine() ?: readLine()?.toInt()
    var exceed = 0
    var noLimit = ""

    if (limitOfRoad.toString() == "no limit") {
        noLimit = limitOfRoad.toString()
    } else if (limitOfRoad.toString().toInt() > 0) {
        exceed = limitOfRoad.toString().toInt()
    }

    when {
        carSpeed > 60 && noLimit == "no limit" ->
        { println("Exceeds the limit by ${carSpeed - 60} kilometers per hour") }
        carSpeed > 60 && exceed >= 60 ->
        { println("Exceeds the limit by ${carSpeed - exceed} kilometers per hour") }
        else -> { println("Within the limit") }
    }
}