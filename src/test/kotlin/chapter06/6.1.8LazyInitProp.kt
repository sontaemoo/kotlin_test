package chapter06

import org.junit.jupiter.api.Test
import kotlin.test.BeforeTest
import kotlin.test.assertEquals

fun main() {

}
class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    private var myService: MyService? = null
    @BeforeTest fun setUp() {
        myService = MyService()
    }

    @Test fun testAction() {
        assertEquals("foo", myService!!.performAction())
    }
}

class MyTest2 {
    private lateinit var myService: MyService
    @BeforeTest fun setUp() {
        myService = MyService()
    }

    @Test fun testAction() {
        assertEquals("foo", myService.performAction())
    }
}