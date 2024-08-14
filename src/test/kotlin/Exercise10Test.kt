package exercices3N2

import kotlin.test.Test
import kotlin.test.assertEquals

class Exercise10Test {
    @Test
    fun testTextAnalyzer() {
        val analyzer = TextAnalyzer()
        val text = "Hello world! This is a test. This test has multiple sentences."

        assertEquals(10, analyzer.countWords(text))
        assertEquals(3, analyzer.countSentences(text))
        assertEquals("this", analyzer.getMostFrequentWord(text))
        assertEquals(4.0, analyzer.getAverageWordLength(text))
    }
}