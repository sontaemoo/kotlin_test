package chapter07

import java.math.BigDecimal

fun main() {
    var p1 = Point(10, 20)
    println(-p1)

    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)
}

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}
