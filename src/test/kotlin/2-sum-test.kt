import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.hackerrank.sum

class `2-sum-test` {

    @Test
    fun shouldReturn3WhenAEquals2AndBEquals3() {
        assertEquals(sum(2, 3), 5)
    }

    @Test
    fun shouldReturn1100WhenAEquals100AndBEquals1000() {
        assertEquals(sum(100, 1000), 1100)
    }

    @Test
    fun shouldNotReturn5WhenAEquals2AndBEquals4() {
        assertNotEquals(sum(2,3), 4)
    }
}