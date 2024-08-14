package exercices3N2

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Exercise9Test {
    @Test
    fun testPasswordGenerator() {
        val generator = PasswordGenerator()

        val password1 = generator.generatePassword(10, true, true)
        assertEquals(10, password1.length)
        assertTrue(password1.any { it.isDigit() })
        assertTrue(password1.any { !it.isLetterOrDigit() })

        val password2 = generator.generatePassword(8, false, false)
        assertEquals(8, password2.length)
        assertTrue(password2.all { it.isLetter() })

        assertEquals("Fort", generator.checkPasswordStrength("P@ssw0rd123!"))
        assertEquals("Faible", generator.checkPasswordStrength("password"))
    }
}