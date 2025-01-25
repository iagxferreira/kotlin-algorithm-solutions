import org.junit.jupiter.api.Test
import hackerrank.compareTriplets
import kotlin.test.assertContentEquals

class `4-compare-triplets-test` {
    @Test
    fun testCompareTriplets() {
        assertContentEquals(compareTriplets(arrayOf(5,6,7), arrayOf(3,6,10)), arrayOf(1,1))
    }
}