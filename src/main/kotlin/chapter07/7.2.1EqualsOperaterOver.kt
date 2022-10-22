package chapter07

fun main() {
    println(Point2(10, 20) == Point2(10, 20))
    println(Point2(10, 20) != Point2(5, 5))
    println(null == Point2(1, 2))
}

data class Point2(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Point2) return false
        return other.x == x && other.y == y
    }
}