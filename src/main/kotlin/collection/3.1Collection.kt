package collection

fun main() {
//    test1()
    test2()
//    test3()
}

fun test1() {
    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1.to("one"), 7 to "seven", 53 to "fifty-three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

}

fun test2() {
    val strings = listOf("first", "second", "fourteenth")
    println(strings.last())

    val numbers = setOf(1, 14, 2)
    println(numbers.maxOrNull())
}

fun test3() {
    val list = listOf(1,2,3)
    println(list)
}