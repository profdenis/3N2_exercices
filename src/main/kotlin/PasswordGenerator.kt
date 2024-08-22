package exercices3N2

enum class PasswordStrength {
    Weak, Medium, Strong
}

class PasswordGenerator {
    private val lowercaseLetters = ('a'..'z').toList()
    private val uppercaseLetters = lowercaseLetters.map { it.uppercaseChar() }
    private val letters = lowercaseLetters + uppercaseLetters
    private val digits = ('0'..'9').toList()
    private val symbols = listOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')')

    fun generatePassword(length: Int, includeDigits: Boolean, includeSymbols: Boolean): String {
        val charPool = letters.toMutableList()
        if (includeDigits)
            charPool.addAll(digits)
        if (includeSymbols)
            charPool.addAll(symbols)
        val password = (1..length).map { _ -> generateRandomChar(charPool)}.toMutableList()
        if (includeDigits && password.all { it !in digits })
            password[0] = digits.random()
        if (includeSymbols && password.all { it !in symbols })
            password[length-1] = symbols.random()
        return password.joinToString("")
    }

    fun checkPasswordStrength(password: String): String {
        if (password.length < 8)
            return PasswordStrength.Weak.toString()
        if (password.any { it in digits } && hasBothLowerAndUppercase(password)) {
            if (password.any { it in symbols })
                return PasswordStrength.Strong.toString()
            return PasswordStrength.Medium.toString()
        }
        return PasswordStrength.Weak.toString()
    }

    private fun generateRandomChar(charPool: List<Char>): Char {
        return charPool.random()
    }

    private fun hasBothLowerAndUppercase(password: String): Boolean {
        return password.any { it.isUpperCase() } && password.any { it.isLowerCase() }
    }
}