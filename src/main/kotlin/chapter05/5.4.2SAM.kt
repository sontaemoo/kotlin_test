package chapter05

fun main() {
    createAllDoneRunnable().run()


}
fun createAllDoneRunnable() : Runnable {
    return Runnable{ println("All done!") }
}