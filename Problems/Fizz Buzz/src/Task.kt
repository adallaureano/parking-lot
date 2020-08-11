import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.next().toInt()
    val b = scanner.next().toInt()

    for (i in a..b) when {
        i % 3 == 0 && i % 5 == 0 -> {
            println("FizzBuzz")
        }
        i % 3 == 0 -> {
            println("Fizz")
        }
        i % 5 == 0 -> {
            println("Buzz")
        }
        else -> println(i)
    }
}
