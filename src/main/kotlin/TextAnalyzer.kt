package exercices3N2

class TextAnalyzer {
    fun countWords(text: String): Int {
        return text.split(" ").size
    }

    fun countSentences(text: String): Int {
        return text.split(".").filter { it != "" }.size
    }

    fun getMostFrequentWord(text: String): String {
        val wordCounts = mutableMapOf<String, Int>()
        text
            .split(" ")
            .map { it.trim { c -> !c.isLetter() }.lowercase() }
            .forEach { wordCounts[it] = (wordCounts[it] ?: 0) + 1 }
        println(wordCounts)
        return wordCounts.maxByOrNull { it.value }?.key ?: ""
    }

    fun getAverageWordLength(text: String): Double {
        return text.split(" ").map { it.trim { c -> !c.isLetter() }.length }.average()
    }
}