package collection

class CenterCall {
}


fun main() {
    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    1.to("one")
    1 to "one"

    val (number, name) = 1 to "one"
    "one" to 1
    for((key, ele) in map){
        println("key: ${key}, ele: ${ele}")
    }
    val list = listOf("1", "2", "3")

    for((idx, ele) in list.withIndex()){
        println("idx: ${idx}, ele: ${ele}")
    }
    list to list.size
}