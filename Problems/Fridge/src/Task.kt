fun Fridge.take(productName: String): Product {
    open()
    val s: Product = find(productName)
    close()
    return s
}