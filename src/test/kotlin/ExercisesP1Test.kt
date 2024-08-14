package exercices3N2

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class ExercisesP1Test {
    @Test
    fun testSumOfDigits() {
        assertEquals(6, sumOfDigits(123))
        assertEquals(10, sumOfDigits(1234))
        assertEquals(15, sumOfDigits(54321))
        assertEquals(1, sumOfDigits(1000))
        assertEquals(0, sumOfDigits(0))

        assertEquals(6, sumOfDigits(-123))
        assertEquals(10, sumOfDigits(-1234))
    }

    @Test
    fun testIsPalindrome() {
        assertEquals(true, isPalindrome("A man a plan a canal Panama"))
        assertEquals(false, isPalindrome("race a car"))
        assertEquals(false, isPalindrome("hello"))
        assertEquals(true, isPalindrome("Able was I ere I saw Elba"))
        assertEquals(true, isPalindrome(""))

        assertEquals(true, isPalindrome("!@#$%^&*()"))
        assertEquals(true, isPalindrome("  kayak     "))
        assertEquals(false, isPalindrome("Almost a palindrome"))
        assertEquals(true, isPalindrome("A Santa at NASA"))
    }

    @Test
    fun testFibonacci() {
        assertEquals(0, fibonacci(0))
        assertEquals(1, fibonacci(1))
        assertEquals(1, fibonacci(2))
        assertEquals(2, fibonacci(3))
        assertEquals(5, fibonacci(5))
        assertEquals(55, fibonacci(10))

        assertFailsWith<IllegalArgumentException> {
            fibonacci(-1)
        }
        assertFailsWith<IllegalArgumentException> {
            fibonacci(-10)
        }
    }

    @Test
    fun testCountOccurrences() {
        assertEquals(3, countOccurrences("Hello, World!", 'l'))
        assertEquals(1, countOccurrences("Hello, World!", 'H'))
        assertEquals(0, countOccurrences("Hello, World!", 'h'))
        assertEquals(0, countOccurrences("Hello, World!", 'z'))
        assertEquals(2, countOccurrences("Hello, World!", 'o'))
        assertEquals(0, countOccurrences("", 'a'))

        assertEquals(0, countOccurrences("", ' '))
        assertEquals(1, countOccurrences("Special @#$%^&*() characters", '@'))
        assertEquals(1, countOccurrences("Case Sensitive", 'S'))
        assertEquals(1, countOccurrences("Newline\ncharacter", '\n'))
    }

    @Test
    fun testReverseWords() {
        assertEquals("olleH dlroW", reverseWords("Hello World"))
        assertEquals("ehT kciuq nworb xof", reverseWords("The quick brown fox"))
        assertEquals("", reverseWords(""))
        assertEquals("a", reverseWords("a"))
        assertEquals("cba fed ihg", reverseWords("abc def ghi"))

        assertEquals("  ", reverseWords("  "))
        assertEquals("olleH, dlroW!", reverseWords("Hello, World!"))
        assertEquals("elpitluM   secaps", reverseWords("Multiple   spaces"))
        assertEquals("noitautcnuP, dna secaps .", reverseWords("Punctuation, and spaces ."))
    }

        @Test
    fun testConvertRomanToArabic() {
        assertEquals(1, convertRomanToArabic("I"))
        assertEquals(4, convertRomanToArabic("IV"))
        assertEquals(9, convertRomanToArabic("IX"))
        assertEquals(1994, convertRomanToArabic("MCMXCIV"))
        assertEquals(3999, convertRomanToArabic("MMMCMXCIX"))

        assertFailsWith<IllegalArgumentException> {
            convertRomanToArabic("IIII")
        }
        assertFailsWith<IllegalArgumentException> {
            convertRomanToArabic("ABC")
        }
    }

    @Test
    fun testIsValidRomanNumeral() {
        assertEquals(true, isValidRomanNumeral("MCMLIV"))
        assertEquals(false, isValidRomanNumeral("IIII"))
        assertEquals(false, isValidRomanNumeral("XYZ"))
        assertEquals(true, isValidRomanNumeral("MMMCMXCIX"))
        assertEquals(false, isValidRomanNumeral("IC"))
    }
}
