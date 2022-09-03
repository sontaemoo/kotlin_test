package chapter06

fun main() {
    val i = 1
    val l: Long = i.toLong()

    val x = 1
    val list = listOf(1L, 2L, 3L)

//    println(x in list)
    println(x.toLong() in list)

    val z = 1_10
    println(z)


    val b: Byte = 1
    val c = b + 1L
    foo(42)
}

fun foo(l: Long) = println(l)