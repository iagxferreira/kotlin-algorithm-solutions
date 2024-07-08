import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class `6-two-sum-test` {

    @Test
    fun twoSum() {
        assertContentEquals(hackerrank.twoSum(intArrayOf(2, 0, 7, 11, 13, 15), 13), intArrayOf(0,3))
    }
}