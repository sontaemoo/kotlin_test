package chapter05

import java.lang.StringBuilder

fun main() {
    println(alphabet4())
    println(alphabet5())
}
fun alphabet4() = StringBuilder().apply {
    for(letter in 'A'..'Z') {
        this.append(letter)
    }
    append("\nNow I know the alphabet!")
    this.toString()
}

fun alphabet5() = buildString {
    for(letter in 'A'..'Z') {
        this.append(letter)
    }
    append("\nNow I know the alphabet!")
}