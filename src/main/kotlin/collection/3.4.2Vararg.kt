package collection

class Vararg {
}

fun main() {
    val args2 = arrayOf("1", "2", "3")

    val list = listOf("args: ", *args2)

//    val list = listOf("args: ", args2);

    println(list)

}