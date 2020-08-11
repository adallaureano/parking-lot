fun main() {
    val value: Int = readLine()!!.toInt()
    println(if (value > -15 && value <= 12 || value in 15..16 || value >= 19) "True" else "False")
}
/*
fun main() {
   val a= readLine()!!.toInt()
   if (a > -15 && a <= 12 || a in 15..16 || a >= 19) println("True") else println("False")
}

 */