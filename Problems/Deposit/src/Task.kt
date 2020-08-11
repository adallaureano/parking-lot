import kotlin.math.pow

fun calculateDeposit(startingAmount: Int = 1000, percentage: Int = 5, numberOfYears: Int = 10): Int {
    return (startingAmount * (1 + percentage / 100.0).pow(numberOfYears.toDouble())).toInt()
}

fun main() {
    when (readLine().toString().toLowerCase()) {
        "amount" -> { println(calculateDeposit(startingAmount = readLine()!!.toInt())) }
        "percent" -> { println(calculateDeposit(percentage = readLine()!!.toInt())) }
        "years" -> { println(calculateDeposit(numberOfYears = readLine()!!.toInt())) }
    }
}
/*
    var startAmount = 1000.0
    var percent = 5.0
    var years = 10.0
    var finalAmount = 0
    when (readLine().toString()) {
        "amount" -> {
            startAmount = readLine()!!.toDouble()
            percent = 1 + percent / 100
            percent = percent.pow(years)
            finalAmount = (startAmount * percent).toInt()
        }
        "percent" -> {
            percent = readLine()!!.toDouble()
            percent = 1 + percent / 100
            percent = percent.pow(years)
            finalAmount = (startAmount * percent).toInt()
        }
        "years" -> {
            years = readLine()!!.toDouble()
            percent = 1 + percent / 100
            percent = percent.pow(years)
            finalAmount = (startAmount * percent).toInt()
        }
    }
    println(finalAmount)
}
 */