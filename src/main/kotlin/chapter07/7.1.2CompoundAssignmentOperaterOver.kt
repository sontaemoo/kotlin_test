package chapter07

fun main() {
    var p1 = Point(1, 2)
    p1 += Point(3, 4)
    println(p1)

    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers[0])

    val list = arrayListOf(1, 2)
    list += 3
    val newList = list + arrayListOf(4, 5)
    println(list)
    println(newList)
}
