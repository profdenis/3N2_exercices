package exercices3N2

import kotlin.math.abs

fun sumOfDigits(number: Int): Int {
    var n = abs(number)
    var sum = 0
    while (n > 0) {
        sum += n % 10
        n /= 10
    }
    return sum
}

fun isPalindrome(str: String): Boolean {
    val letters = str.lowercase().filter { it.isLetter() }
    return letters == letters.reversed()
}

fun fibonacci(n: Int): Int {
    if (n < 0) throw IllegalArgumentException()
    if (n == 0) return 0
    if (n == 1) return 1
    var x = 0
    var y = 1
    var z = 0
    for (i in 2..n) {
        z = x + y
        x = y
        y = z
    }
    return z
}

fun countOccurrences(str: String, char: Char): Int {
    return str.count { it == char }
}

fun reverseWords(sentence: String): String {
    val result = StringBuilder()
    var word = StringBuilder()
    for (c in sentence) {
        if (c.isLetter()) {
            word.append(c)
        } else {
            result.append(word.toString().reversed())
            word = word.clear()
            result.append(c)
        }
    }
    result.append(word.toString().reversed())
    return result.toString()
}

fun convertRomanToArabic(roman: String): Int {

    if (!isValidRomanNumeral(roman)) throw IllegalArgumentException()

    val romanToInt = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var arabic = 0
    var prevValue = 0

    for (char in roman.reversed()) {
        val value = romanToInt[char] ?: 0
        if (value >= prevValue) {
            arabic += value
        } else {
            arabic -= value
        }
        prevValue = value
    }

    return arabic
    
}

fun isValidRomanNumeral(roman: String): Boolean {
    val regex = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$".toRegex()
    return regex.matches(roman)
}