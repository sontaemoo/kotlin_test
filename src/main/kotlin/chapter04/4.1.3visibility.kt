package chapter04

fun main() {
}

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")
    protected open fun whisper() = println("Let's talk!")
}


//fun TalkativeButton.giveSpeech() {
//    yell()
//    whisper()
//}
internal class TalkactiveButton2 : TalkativeButton() {
    override fun whisper() {
        super.whisper()
        println("Let's talk!")
    }

}
