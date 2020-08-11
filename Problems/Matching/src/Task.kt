fun main() {
    val a = readLine()!!.toBigInteger()
    val b = readLine()!!.toBigInteger()
    val c = readLine()!!.toBigInteger()

    when {
        a == b && a == c -> { println(3) }
        a == b || a == c || b == c -> { println(2) }
        else -> { println(0) }
    }
}