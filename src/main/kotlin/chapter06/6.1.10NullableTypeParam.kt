package chapter06

fun main() {
    println(printHashCode(null))
//    println(printHashCode2(null))
}

fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

fun <T: Any> printHashCode2(t: T) {
    println(t?.hashCode())
}