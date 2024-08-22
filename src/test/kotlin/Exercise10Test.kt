package exercices3N2

import kotlin.test.Test
import kotlin.test.assertEquals

class Exercise10Test {
    @Test
    fun testTextAnalyzer() {
        val analyzer = TextAnalyzer()
        val text = "This is a test. This test has multiple sentences. Multiple words are also in this sentence."

        assertEquals(16, analyzer.countWords(text))
        assertEquals(3, analyzer.countSentences(text))
        assertEquals("this", analyzer.getMostFrequentWord(text))
        assertEquals(73/16.0, analyzer.getAverageWordLength(text))
    }
}