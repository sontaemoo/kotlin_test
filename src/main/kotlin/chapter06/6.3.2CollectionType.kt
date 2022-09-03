package chapter06

fun main() {
    val source: Collection<Int> = arrayListOf(3,5,7)
    val target: MutableCollection<Int> = arrayListOf(1)
    copyElement(source, target)
    println(target)
}

fun <T> copyElement(source: Collection<T>, target: MutableCollection<T>) {
    for(item in source) {
        target.add(item)
    }
}