package chapter09

import java.lang.StringBuilder

fun main() {
    println(listOf(0,1,2,3,4,5).sum())

    println(oneHalf(3))

    println(max("Kotlin", "Java"))

    val helloWorld = StringBuilder("Hello world")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)
}

//fun <T : Number> List<T>.sum() : T {
//    return
//}

fun <T : Number> oneHalf(value: T): Double {
    return value.toDouble() / 2.0
}

fun <T : Comparable<T>> max(first: T, second: T): T {
    return if(first > second) first else second
}

fun <T> ensureTrailingPeriod(seq: T)
    where T : CharSequence, T : Appendable {
        if(!seq.endsWith('.')) {
            seq.append('.')
        }
    }
