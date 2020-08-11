data class Box(
        val height: Int,
        val length: Int,
        val width: Int
    ) {
    private var size: Int = height + length + width
    override fun toString() = "Box(height=$height, width=$width, size=$size)"
}