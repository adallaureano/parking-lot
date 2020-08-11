// val lambda: (Int) -> Int = { x: Int -> a * Math.pow(x.toDouble(), 2.0).toInt()  + b * x + c }
val lambda: (Int) -> Int = { a * it * it + b * it + c }