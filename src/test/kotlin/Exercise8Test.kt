package exercices3N2

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class Exercise8Test {
    @Test
    fun testRPNCalculator() {
        val calculator = RPNCalculator()

        assertEquals(3.0, calculator.evaluate("1 2 +"))
        assertEquals(23.0, calculator.evaluate("5 4 * 3 +"))
        assertEquals(141.0, calculator.evaluate("3 4 + 5 * 3 -"))

        assertFailsWith<IllegalArgumentException> {
            calculator.evaluate("1 +")
        }
        assertFailsWith<IllegalArgumentException> {
            calculator.evaluate("1 2 3 +")
        }
    }
}