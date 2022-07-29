package chapter04

import java.io.Serializable

fun main() {
}

interface State: Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class Button4: View {
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) {
        super.restoreState(state)
        println("df")
    }

    class ButtonState: State {

    }
}

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}