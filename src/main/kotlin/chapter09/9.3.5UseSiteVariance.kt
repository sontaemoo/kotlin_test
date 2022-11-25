package chapter09

fun main() {
    val ints = mutableListOf(1,2,3)
    val anyItems = mutableListOf<Any>()
    copyData2(ints, anyItems)
    println(anyItems)

    val list:MutableList<out Number> = mutableListOf(1,2,3,4)
//    list.add(42)

//    val listInit = {idx: Int -> idx}
//    val outList = List<out Int>(10, listInit)
}

fun <T> copyData(source: MutableList<T>, destination: MutableList<T>) {
    for(item in source) {
        destination.add(item)
    }
}


fun <T:R, R> copyData2(source: MutableList<T>, destination: MutableList<R>) {
    for(item in source) {
        destination.add(item)
    }
}

fun <T> copyData3(source: MutableList<out T>, destination: MutableList<T>) {
    for(item in source) {
        destination.add(item)
    }
}

fun <T> copyData4(source: MutableList<T>, destination: MutableList<in T>) {
    for(item in source) {
        destination.add(item)
    }
}