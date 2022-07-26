package chapter04

fun main() {
//    Button().click()
//    Button().showOff()

    val button2 = Button2()

    button2.click()
    button2.setFocus(true)
    button2.showOff()
}



interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

class Button: Clickable {
    override fun click() = println("I was clicked")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

class Button2: Clickable, Focusable {
    override fun click() = println("I was clicked")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}
