import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class `7-reverse-array-test` {

    @Test
    fun testReverseArray() {
        assertContentEquals(
            hackerrank.reverseArray(
                intArrayOf(2, 0, 7, 11, 13, 15).toTypedArray()),
                intArrayOf(15, 13, 11, 7, 0, 2).toTypedArray()
        )
    }
}