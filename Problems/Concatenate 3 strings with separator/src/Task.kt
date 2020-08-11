fun main() {
    val a = readLine().toString()
    val b = readLine().toString()
    val c = readLine().toString()
    val d = readLine().toString().toUpperCase()

    print(if (d == "NO SEPARATOR") {
        "$a $b $c"
    } else {
        "$a$d$b$d$c"
    })
}