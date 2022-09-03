package chapter06

fun main() {

}

fun f(): Unit {}
fun ff() {}

interface Processor<T> {
    fun process(): T
}

class NoResultProcessor: Processor<Unit> {
    override fun process() {
        TODO("Not yet implemented")
    }
}