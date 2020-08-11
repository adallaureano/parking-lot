
fun main() {
    fun Int.negative() = -this
    fun Int.addFive() = this + 5
    fun Int.double() = this * 2
    val a = 1
    println(a.negative().addFive().double())
}
/*

import kotlin.math.roundToInt

fun main() {
    val leatherCase = LeatherCase(190, "brown")
    val softCase = SoftCase(120, "yellow")
    val woodCase = WoodCase(230, "orange")
    println(getCaseTax(leatherCase) + getCaseTax(softCase) + getCaseTax(woodCase))
}



open class Case(val cost: Int) {
    fun getFullInfo(): String = "$$cost cost" + getTax()

    open fun getTax(): Int = (cost * 0.25).roundToInt()
}

open class SoftCase(cost: Int, val color: String) : Case(cost) {
    override fun getTax(): Int = super.getTax() + 100
}

open class WoodCase(cost: Int, val color: String) : Case(cost)

open class LeatherCase(cost: Int, color: String) : SoftCase(cost, color) {
    override fun getTax(): Int = (cost * 0.35).roundToInt()
}

fun getCaseTax(case: Case): Int = case.getTax()

----------
fun reverse(input: Int?): Int? {
 val result =  input?.rem(10)?.toString()?.plus((input?.div(10)?.rem(10)))?.toString().plus(input?.div(100)?.toString())
    return result?.toInt() ?: -1
}
fun main() {
    println(reverse(readLine()?.toInt()))
}

/*
fun reverse(input: Int?): Int? {
    val first = input?.div(100)
    val second = (input?.div(10)?.rem(10))
    val last = input?.rem(10)
    val result = last.toString() + second.toString() + first.toString()
    return result?.toInt() ?: -1


input?.rem(10)?.toString().plus((input?.div(10)?.rem(10)?.toString())).plus(input?.div(100).toString())
}
 */
--------


    val nullableList: List<Int?> = listOf(1, 2, null, 3)
    val intList: List<Int> = nullableList.filterNotNull()
    print(intList)

fun main() {
    print("Hello, ")
    // print("world")
    // print(" and ")
    print("Kotlin")


    /*
    val nullName: String? = "Peter"
    val firstName = nullName ?: "John"
    println(firstName)
     */
}

    data class Student(val name: String, val age: Int, val school: String)

    val prospectiveStudents: ArrayList<Student> = ArrayList()
    val admittedStudents: ArrayList<Student> = ArrayList()

    prospectiveStudents.add(Student("Peter Pan", 20, "UNIA"))
    prospectiveStudents.add(Student("Jane Systron", 21, "Georgia"))
    prospectiveStudents.add(Student("John Doe", 18, "UAN"))
    prospectiveStudents.add(Student("Belinda Pedro", 16, "Ukraine"))
    prospectiveStudents.add(Student("Ieshila", 17, "IMETRO"))

    for (student in prospectiveStudents) {
        if (student.age < 16) {
            continue
        }
        admittedStudents.add(student)

        if (admittedStudents.size >= 3) {
            break
        }
    }

    println(admittedStudents.joinToString())

 */