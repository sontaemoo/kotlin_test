package collection

open class View {
    open fun click() = println("View clicked")
    open fun showMeTheMoney() = println("View SMTM")
}

class Button: View() {
    override fun click() = println("Button clicked")
    override fun showMeTheMoney() = println("Button SMTM")
}

fun View.showOff() = println("I'm a view!" + this.javaClass)
fun Button.showOff() = println("I'm a button!" + this.javaClass)

fun View.showMeTheMoney() = println("View SMTM Ext" + this.javaClass)
fun Button.showMeTheMoney() = println("Button SMTM Ext" + this.javaClass)

fun main() {
    val view:View = Button();
//    view.click()
    view.showOff()
//    view.showMeTheMoney()
}
class Override {
}