import java.math.BigInteger

fun main() {
    val (a, b) = Array(2) { BigInteger(readLine()) }
    println("${a * 100.toBigInteger() / (a + b)}% ${b * 100.toBigInteger() / (a + b)}%")
}
    /*
var a = BigInteger(readLine())
var b = BigInteger(readLine())
val c = a + b
a *= BigInteger.valueOf(100)
b *= BigInteger.valueOf(100)
println("${a / c}% ${b / c}")
    */