package chapter09

fun main() {
    val nullableStringProcessor = Processor<String?>()
    nullableStringProcessor.process(null)

//    val nullableStringProcessor2 = Processor2<String?>()
}

class Processor<T> {
    fun process(value: T) {
        value?.hashCode()
//        value.hashCode()
    }
}

class Processor2<T : Any> {
    fun process(value: T) {
        value.hashCode()
    }
}