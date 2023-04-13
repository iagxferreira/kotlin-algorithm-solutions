import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class `3-array-sum-test` {

    @Test
    fun shouldMatch10() {
        assertEquals(arraySum(listOf(1,2,3,4)), 10)
    }

    @Test
    fun shouldNotMatch10() {
        assertNotEquals(arraySum(listOf(1,2,3,5)), 10)
    }
}