fun reverse(input: Int?) = input?.toString()?.reversed()?.toInt() ?: -1
/*
fun reverse(number: Int?): Int? {
    val resultList = number?.toString()?.split("")
    val result = resultList?.reversed()
    val r = result?.joinToString("")
    return r?.toInt() ?: -1

}
 */