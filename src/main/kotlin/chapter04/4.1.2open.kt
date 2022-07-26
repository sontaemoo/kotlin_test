package chapter04

fun main() {
}

open class RichButton: Clickable {
    fun disable() {}
    open fun animate() {}
    override fun click() {}
}

abstract class Animated {
    abstract fun animate()
    open fun stopAnimating() {

    }
    fun animateTwice() {

    }
}