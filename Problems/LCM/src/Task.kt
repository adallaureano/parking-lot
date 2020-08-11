import java.math.BigInteger

fun gcd(a: BigInteger, b: BigInteger): BigInteger = if (a == BigInteger.ZERO) b else gcd(b % a, a)
fun lcm(a: BigInteger, b: BigInteger) = a * b / gcd(a, b)

fun main() {
    val a = readLine()!!.toBigInteger()
    val b = readLine()!!.toBigInteger()
    println(lcm(a, b))
}