package chapter08

import java.lang.StringBuilder

fun main() {
    val letters = listOf("Alpha", "Beta")
    println(letters.joinToString2())
    println(letters.joinToString2 {it.lowercase()})
    println(letters.joinToString2(separator = "! ", postfix = "! ") {it.uppercase()})
}
fun <T> Collection<T>.joinToString(separator: String=", ", prefix: String = "", postfix: String = ""): String {
    val result = StringBuilder(prefix)
    for((index, element) in this.withIndex()) {
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}


fun <T> Collection<T>.joinToString2(separator: String=", ", prefix: String = "", postfix: String = "",
                                    transform: (T) -> String = {it.toString()}): String {
    val result = StringBuilder(prefix)
    for((index, element) in this.withIndex()) {
        if(index > 0) result.append(separator)
        result.append(transform(element))
    }
    result.append(postfix)
    return result.toString()
}


fun <T> Collection<T>.joinToString3(separator: String=", ", prefix: String = "", postfix: String = "",
                                    transform: ((T) -> String)? = null): String {
    val result = StringBuilder(prefix)
    for((index, element) in this.withIndex()) {
        if(index > 0) result.append(separator)
        val str = transform?.invoke(element) ?: element.toString()
        result.append(str)
    }
    result.append(postfix)
    return result.toString()
}