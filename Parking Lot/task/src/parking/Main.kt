package parking

import java.util.*

class ParkingLot (private val num: Int) {
    private val lots = mutableMapOf<Int, String>()

    init {
        if (num != 0) println("Created a parking lot with $num spots.")
    }

    fun status() {
        when (num) {
            0 -> println("Sorry, a parking lot has not been created.")
            else -> {
                var empty = true
                for (i in 1..num) if (lots[i] != null) {
                    println("$i ${lots[i]}") // e.g "1 KA-01-HH-9999 White"
                    empty = false
                }
                if (empty) println("Parking lot is empty.")
            }
        }
    }

    fun park(car: String, carColor: String) = when (num) {
        0 -> println("Sorry, a parking lot has not been created.")
        else -> {
            var freeSpot = 0
            for (i in 1..num) if (lots[i] == null) {
                freeSpot = i
                break
            }
            if (freeSpot == 0) println("Sorry, the parking lot is full.")
            else {
                println("$carColor car parked in spot $freeSpot.")
                lots[freeSpot] = "$car $carColor"
            }
        }
    }

    fun leave(slot: Int) {
        when {
            num == 0 -> println("Sorry, a parking lot has not been created.")
            lots[slot] == null -> println("There is no car in spot $slot")
            else -> {
                println("Spot $slot is free.")
                lots.remove(slot)
            }
        }
    }

    fun spotByColor(carColor: String) {
        when (num) {
            0 -> println("Sorry, a parking lot has not been created.")
            else -> {
                val listOfCars = mutableListOf<String>()
                for (lot in lots.keys) {
                    var carC = lots[lot].toString()
                    carC = carC.substringAfter(" ").toLowerCase()
                    if (carC == carColor.toLowerCase()) {
                        listOfCars.add(lot.toString())
                    }
                }
                if (listOfCars.isNotEmpty()) {
                    println(listOfCars.joinToString())
                } else {
                    println("No cars with color $carColor were found.")
                }
            }
        }
    }

    fun regByColor(carColor: String) {
        when (num) {
            0 -> println("Sorry, a parking lot has not been created.")
            else -> {
                val listOfCars = mutableListOf<String>()
                var carReg: String
                var carC: String
                for (lot in lots.keys) {
                    val mainSubstring = lots[lot].toString()
                    carC = mainSubstring.substringAfter(" ").toLowerCase()
                    if (carC == carColor.toLowerCase()) {
                        carReg = mainSubstring.substringBefore(" ")
                        listOfCars.add(carReg)
                    }
                }
                if (listOfCars.isNotEmpty()) {
                    println(listOfCars.joinToString())
                } else {
                    println("No cars with color $carColor were found.")
                }
            }
        }
    }

    fun spotByReg(carReg: String) {
        when (num) {
            0 -> println("Sorry, a parking lot has not been created.")
            else -> {
                val listOfCars = mutableListOf<String>()
                var carR: String
                for (lot in lots.keys) {
                    val mainSubstring = lots[lot].toString()
                    carR = mainSubstring.substringBefore(" ")
                    if (carR == carReg) {
                        listOfCars.add(lot.toString())
                    }
                }
                if (listOfCars.isNotEmpty()) {
                    println(listOfCars.joinToString())
                } else {
                    println("No cars with registration number $carReg were found.")
                }
            }
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    var lot = ParkingLot (0)

    while (scanner.hasNext()) {
        val cmd = scanner.nextLine() // command param1 param2
        val seq = cmd.split(" ")     // seq0 = command seq1 = param1 seq2 = param2
        when (seq[0]) {
            "exit" -> return
            "create" -> lot = ParkingLot (seq[1].toInt())
            "status" -> lot.status()
            "park" -> lot.park(seq[1],seq[2])
            "leave" -> lot.leave(seq[1].toInt())
            "spot_by_color" -> lot.spotByColor(seq[1])
            "reg_by_color" -> lot.regByColor(seq[1])
            "spot_by_reg" -> lot.spotByReg(seq[1])
        }
    }
}
/*
fun spotByColor(carColor: String) {
        when (num) {
            0 -> println("Sorry, a parking lot has not been created.")
            else -> {
                var listOfCars = emptyList<Int>()
                for (i in lots.keys) {
                    var carC = lots[i].toString()
                    //carC = carC.substringAfter(",")
                    val carR = carC.split(" ").toString().substringAfter(",").toLowerCase()
                    finalCarR = finalCarR.replace("]", " ")
                    if (carC == carColor) {
                        listOfCars += i
                    } else {
                        println("No cars with color $carColor were found.")
                        break
                    }
                }
                for (car in listOfCars) {
                  print("$car, ")
                }
            }
        }
    }
----------------
package parking

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var parkingLot = BooleanArray(0)
    var parkingList = emptyList<Boolean>()
    var color = ""
    var emptySpot = 0
    var registrationNumber = ""
    var listOfRegister = emptyList<String>()
    var listOfColor = emptyList<String>()

    fun create(create: Int = scanner.nextInt()) {
        parkingLot = BooleanArray(create)
        parkingList = parkingLot.toList()
        println("Created a parking lot with $create spots.")

    }

    fun park() {
        if (parkingLot.isEmpty()) {
            println("Sorry, a parking lot has not been created.")
        } else {
            registrationNumber = scanner.next()
            emptySpot = parkingLot.indexOf(false)
            color = scanner.next()
            if (emptySpot == -1) {
                println("Sorry, the parking lot is full.")
            } else {
                parkingLot[emptySpot] = true
                println("$color car parked in spot ${emptySpot + 1}.")
            }
        }
        listOfRegister += listOf(registrationNumber)
        listOfColor += listOf(color)
    }

    fun leave(spot: Int = scanner.nextInt()) {
        if (parkingLot[spot - 1]) {
            parkingLot[spot - 1] = false
            println("Spot $spot is free.")
        } else {
            println("There is no car in spot $spot.")
        }
    }

    fun status() = when {
        parkingLot.isEmpty() -> {
            println("Sorry, a parking lot has not been created.")
        }
        emptySpot == 0 -> {
            println("Parking lot is empty.")
        }
        else -> {

            var register = " "
            var colorPrint = " "
            var countColor = 0
            var countR = 0
            for (occupied in 0..parkingList.size) {
                if (occupied <= parkingList.size) {
                    loop@ for (cP in 0..listOfColor.size) {
                        if (countColor <= cP) {
                            colorPrint = listOfColor[cP]
                            countColor++
                            break@loop
                        }
                    }
                    loop@ for (r in 0..listOfRegister.size) {
                        if (countR <= r) {
                            register = listOfRegister[r]
                            countR++
                            break@loop
                        }
                    }
                    if (parkingLot[occupied].toString() == "true") {
                        println("$occupied $register $colorPrint")
                    }
                }
            }
        }
    }

    fun selectAction() {
        do {
            val action = scanner.next()
            when (action) {
                "create" -> {
                    create()
                }
                "park" -> {
                    park()
                }
                "leave" -> {
                    leave()
                }
                "status" -> {
                    status()
                }
            }
        } while (action != "exit")
    }

    selectAction()

}
 */
