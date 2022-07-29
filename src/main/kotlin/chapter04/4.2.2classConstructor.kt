package chapter04

import javax.naming.Context
import javax.swing.text.AttributeSet

fun main() {
}


open class View2{
    constructor(ctx: Context) {

    }
    constructor(ctx: Context, attr: AttributeSet) {

    }
}

class MyButton: View2 {
    constructor(ctx: Context): super(ctx){

    }
    constructor(ctx: Context, attr: AttributeSet): super(ctx, attr){

    }

}