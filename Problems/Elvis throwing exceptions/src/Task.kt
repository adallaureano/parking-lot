fun main() = println("Elvis says: " + (readLine() ?: error("empty line")))
/*
fun main() {
    val line: String? = readLine()
    println("Elvis says: ${line ?: throw IllegalStateException()}")
}
 */