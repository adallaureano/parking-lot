fun main() {
    val numbs = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val shiftAmount = readLine()!!.toInt()

    repeat(shiftAmount % numbs.size) {
        shift(numbs)
    }
    for (num in numbs) print("$num ")
}

fun shift(nums: IntArray) {
    val last = nums[nums.lastIndex]
    for (i in nums.lastIndex downTo 1) {
        nums[i] = nums[i - 1]
    }
    nums[0] = last
}

/*
fun main() {
    val num = readLine()!!.toInt()
    val strNumb:Array<String> = readLine()!!.split(" ").toTypedArray()
    val count = readLine()!!.toInt()

    val numbers = IntArray(strNumb.size)

    for (i in strNumb.indices) {
        numbers[i] = strNumb[i].toInt()
    }

    for (num: Int in rightRotate(numbers, count)) {
        print("$num ")
    }
}

fun rightRotate(numb: IntArray, count: Int): IntArray {
    val rotatedNumbers: IntArray = numb.clone()
    for (i in rotatedNumbers.indices) {
        rotatedNumbers[(i + count) % rotatedNumbers.size] = numb[i]
    }
    return rotatedNumbers
}
 */
