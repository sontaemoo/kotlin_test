package chapter06

import java.io.File

fun main(args: Array<String>) {
    for(i in args.indices){
        println("Argument ${i} is: ${args[i]}")
    }

    val letters = Array<String>(26) { i -> ('a' + i).toString()}
    println(letters.joinToString(""))


    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))

    val fiveZeros = IntArray(5)
    val fiveZerosToo = intArrayOf(0,0,0,0,0)

    val squares = IntArray(5) {i -> (i+1) * (i+1)}
    println(squares.joinToString())


    args.forEachIndexed {index, element -> println("Argument ${index} is: ${element}") }
}
