package chapter07

fun main() {
    val p = Point(10, 20)
    val (x, y) = p
    println(x)
    println(y)

    val (name, ext) = splitFilename("example.kt")
    println(name)
    println(ext)

    val (name2, ext2) = splitFilename2("example.kt")
    println(name2)
    println(ext2)

    val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotlin")
    printEntries(map)
}

data class NameComponents(val name: String, val extension: String)

fun splitFilename(fullName: String): NameComponents {
    val result = fullName.split(".", limit = 2)
    return NameComponents(result[0], result[1])
}

fun splitFilename2(fullName: String): NameComponents {
    val (name, ext) = fullName.split(".", limit = 2)
    return NameComponents(name, ext)
}

fun printEntries(map: Map<String, String>) {
    for((key, value) in map) {
        println("${key} -> ${value}")
    }
}