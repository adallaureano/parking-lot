import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    val numbers = IntArray(number) { scanner.nextInt() }
    println(numbers.indexOf(numbers.max()!!))
}
//val maxId = numbers.indices.maxBy { numbers[it] } ?: - 1