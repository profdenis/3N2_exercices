package exercices3N2

class RPNCalculator {
    private val stack = mutableListOf<Double>()

    fun evaluate(expression: String): Double {
        expression.split(" ").forEach(::processToken)
        if (stack.size != 1)
            throw IllegalArgumentException()
        return stack.removeLast()
    }

    private fun processToken(token: String) {
        val value = token.toDoubleOrNull()
        if (value != null) {
            stack.addLast(value)
            return
        }
        try {
            val y = stack.removeLast()
            val x = stack.removeLast()
            when (token) {
                "+" -> stack.addLast(x + y)
                "-" -> stack.addLast(x - y)
                "*" -> stack.addLast(x * y)
                "/" -> stack.addLast(x / y)
                else -> throw IllegalArgumentException()
            }
        } catch (e: NoSuchElementException) {
            throw IllegalArgumentException()
        }
    }
}