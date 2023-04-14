import basics.exercise1
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class `1-hello-world-test` {

    @Test
    fun shouldReturnHelloWorld() {
        assertEquals(exercise1(), "Hello World!")
    }

    @Test
    fun shouldNotReturnString() {
        assertNotEquals(exercise1(), "Hello Wod!")
    }
}