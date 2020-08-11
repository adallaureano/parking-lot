import java.util.Scanner

data class Box(val height: Int, val length: Int, val width: Int)

fun main() {
    val input = Scanner(System.`in`)
    val height = input.nextInt()
    val length = input.nextInt()
    val lengthBoxCopy = input.nextInt()
    val width = input.nextInt()
    val box = Box(height, length, width)
    val boxCopy = box.copy(length = lengthBoxCopy)
    println("Box(height=${box.height}, length=${box.length}, width=${box.width})")
    println("Box(height=${boxCopy.height}, length=${boxCopy.length}, width=${boxCopy.width})")
}