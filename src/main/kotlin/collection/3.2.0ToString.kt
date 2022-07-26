@file:JvmName("StringFunctions")
package collection

fun main() {
    val list = listOf(1,2,3)
//    println(joinToString(list, "; ", "(", ")"))
//
//    println(joinToString(list, separator = "; ", prefix = "(", postfix = ")"))
//

//    println(joinToString(list))
//
//    println(joinToString(list, ":"))
//
//    println(joinToString(list,prefix = "-", postfix = "-"))

    println(list.joinToString())
    println(listOf("1", "2", "3").join())
//    println(listOf(1, 2, 3).join())

}

@JvmOverloads
fun <T> Collection<T>.joinToString(
    separator: String = "; ",
    prefix: String = "(",
    postfix: String = ")"
): String {
    val result = StringBuilder(prefix)
    for((index, element) in this.withIndex()) {
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

@JvmOverloads
fun Collection<String>.join(
    separator: String = "; ",
    prefix: String = "(",
    postfix: String = ")"
) = joinToString(separator = separator, prefix = prefix, postfix = postfix)

//@JvmOverloads
//fun <T> joinToString(
//    collection: Collection<T>,
//    separator: String = "; ",
//    prefix: String = "(",
//    postfix: String = ")"
//): String {
//    val result = StringBuilder(prefix)
//    for((index, element) in collection.withIndex()) {
//        if(index > 0) result.append(separator)
//        result.append(element)
//    }
//    result.append(postfix)
//    return result.toString()
//}