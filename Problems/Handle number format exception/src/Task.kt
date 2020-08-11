fun whitespace(word: String): Int {
    var space = 0
    for (element in word) {
        if (element == ' ') {
            space++
        }
    }
    return space
}
fun parseCardNumber(cardNumber: String): Long = if (whitespace(cardNumber) == 3) {
    cardNumber.replace(" ", "").toLong()
} else throw NumberFormatException("Wrong format")

/*
fun parseCardNumber(cardNumber: String) = cardNumber.split(" ").let {
    if (it.size != 4) throw Exception("Bad card") else it.joinToString("").toLong()
}

fun parseCardNumber(cardNumber: String): Long {
    if (cardNumber.split(" ").size < 4) throw Exception("Invalid card number")
    return cardNumber.replace(" ", "").toLong()
}
 */