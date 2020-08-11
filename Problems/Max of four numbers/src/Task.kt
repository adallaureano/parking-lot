import java.util.*
import kotlin.math.max

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()
    val result1 = max(a, b)
    val result2 = max(c, d)
    val result = max(result1, result2)
    println(result)
}
/*
println(Array(4) { Scanner(System.`in`).nextInt()}.reduce { it, i -> it.coerceAtLeast(i) })

fun main() = println(Array(4) { readLine()!!.toInt()}.max())
 */