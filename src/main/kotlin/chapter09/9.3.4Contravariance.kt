package chapter09

import kotlin.Comparator

fun main() {
    val anyComparable = Comparator<Any> {
        e1, e2 -> e1.hashCode() - e2.hashCode()
    }

    val strings: List<String> = listOf("a", "b", "c", "d")

    strings.sortedWith(anyComparable)

    enumrateCats(Animal::getIndex)
}

interface Function1<in P, out R> {
    operator fun invoke(p:P): R
}

fun enumrateCats(f: (Cat) -> Number) {

}

fun Animal.getIndex(): Int = this.getIndex()