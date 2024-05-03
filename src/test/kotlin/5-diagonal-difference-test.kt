import org.junit.jupiter.api.Test
import kotlin.hackerrank.diagonalDifference
import kotlin.test.assertEquals

class `5-diagonal-difference-test` {
    @Test
    fun testDiagonalDifference() {
        assertEquals(
            diagonalDifference(
            arrayOf(
                arrayOf(11,2,4),
                arrayOf(4,5,6),
                arrayOf(10,8,-12)
            )), 15)
    }
}