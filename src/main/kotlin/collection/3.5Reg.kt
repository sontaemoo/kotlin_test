package collection

class Reg {
}

fun main() {
    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".", "-"))

    parsePath("/Users/yole/kotlin-book/chapter.adoc")

    threeLine()
}

//fun parsePath(path: String) {
//    val directory = path.substringBeforeLast("/")
//    val fullName = path.substringAfterLast("/")
//    val fileName = fullName.substringBeforeLast(".")
//    val extension = fullName.substringAfterLast(".")
//
//    println("Dir: ${directory}, name: ${fileName}, ext: ${extension}")
//}


fun parsePath(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)

    if (matchResult != null) {
//        println(matchResult.javaClass)
        val (directory, fileName, extension) = matchResult.destructured
        println("Dir: ${directory}, name: ${fileName}, ext: ${extension}")
    }
}

fun threeLine() {
    val kotlinLogo = """| //  
                        .| //
                        .|/\"""
    println(kotlinLogo.trimMargin("."))
}