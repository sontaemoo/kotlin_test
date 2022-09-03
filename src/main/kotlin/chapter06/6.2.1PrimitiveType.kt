package chapter06

fun main() {
    val i: Int = 1
    val list: List<Int> = listOf(1,2,3)

    showProgress(145)
}

fun showProgress(progress: Int) {
    val percent = progress.coerceIn(0, 100)
    println("We're ${percent}% done!")
}