import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val weekend = scanner.nextBoolean()
    println(n in 10..20 && !weekend || n in 15..25 && weekend)
}
/*
fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextBoolean()

    when {
        a in 10..20 && !b -> println(true)
        a in 15..25 && b -> println(true)
        else -> println(false)
    }
 */