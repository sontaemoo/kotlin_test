package chapter06

fun main() {

}
class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    private var myService: MyService? = null
//    @Before fun setUp() {
//        myService = MyService()
//    }
//
//    @Test fun testAction() {
//        Assert.assertEquals("foo", myService!!.performAction())
//    }
}