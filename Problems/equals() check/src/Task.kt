import java.util.Scanner

data class Client(val name: String, val age: Int, val balance: Int)

fun main() {
    val input = Scanner(System.`in`)
    val name = input.next()
    val age = input.nextInt()
    val balance = input.nextInt()
    val nameCopy = input.next()
    val ageCopy = input.nextInt()
    val balanceCopy = input.nextInt()
    val john = Client(name, age, balance)
    val johnCopy = Client(nameCopy, ageCopy, balanceCopy)
    println(john.name == johnCopy.name && john.age == johnCopy.age)
}