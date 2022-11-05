package chapter09

import kotlin.IllegalArgumentException

fun main() {
//    printSum(listOf(1,3,4))
//
//    printSum(listOf("a", "b", "c"))

    printSum2(listOf(1,3,4))

//    printSum2(listOf("a", "b", "c"))
}

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int> ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())

}

fun printSum2(c: Collection<Int>) {
    if(c is List<Int>) {
        println(c.sum())
    }
}