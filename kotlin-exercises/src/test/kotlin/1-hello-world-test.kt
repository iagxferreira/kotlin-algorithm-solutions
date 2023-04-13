import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class `1-hello-world-test` {

    @Test
    fun shouldReturnHelloWorld() {
        assertEquals(helloWorld(), "Hello World!")
    }

    @Test
    fun shouldNotReturnString() {
        assertNotEquals(helloWorld(), "Hello Wod!")
    }
}