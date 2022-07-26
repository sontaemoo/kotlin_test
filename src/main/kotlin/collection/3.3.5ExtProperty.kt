package collection

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main() {
    println("asdf".lastChar)
    val sb = StringBuilder("asdf")
    sb.lastChar = '?'
    println(sb)
}
class ExtProperty {
}