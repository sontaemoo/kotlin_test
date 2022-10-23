package chapter08

fun main() {
    val sum = {x:Int, y:Int -> x + y}
    val action = { println(42) }

    val sum2: (Int, Int) -> Int = {x, y -> x + y}
    val action2: () -> Unit = { println(42) }

    var canReturnNull: (Int, Int) -> Int? = {x, y -> null}
    var funOrNull: ((Int, Int) -> Int)? = null
}