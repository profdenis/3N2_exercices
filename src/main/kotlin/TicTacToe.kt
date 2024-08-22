package exercices3N2

class TicTacToe {
    private val board = emptyMap<Pair<Int, Int>, Char>().toMutableMap()

    // Winning combinations: rows, columns, and diagonals
    private val winningPositions = listOf(
        listOf(1 to 1, 1 to 2, 1 to 3), // First row
        listOf(2 to 1, 2 to 2, 2 to 3), // Second row
        listOf(3 to 1, 3 to 2, 3 to 3), // Third row
        listOf(1 to 1, 2 to 1, 3 to 1), // First column
        listOf(1 to 2, 2 to 2, 3 to 2), // Second column
        listOf(1 to 3, 2 to 3, 3 to 3), // Third column
        listOf(1 to 1, 2 to 2, 3 to 3), // Main diagonal
        listOf(1 to 3, 2 to 2, 3 to 1)  // Back diagonal
    )

    fun makeMove(player: Char, row: Int, col: Int): Boolean {
        if (row !in 1..3 || col !in 1..3) return false
        if (row to col in board) return false
        board[row to col] = player
        return true
    }

    fun checkWinner(): Char? {
        for (positions in winningPositions) {
            val chars = positions.map { board[it] }
            if (chars.all { it != null && it == chars[0] }) {
                return chars[0] // Return winner (either 'X' or 'O')
            }
        }

        return null // No winner yet
    }

    fun isBoardFull(): Boolean {
        return board.size == 9
    }

    fun printBoard() {
        for (row in 1..3) {
            for (col in 1..3) {
                val symbol = board[row to col] ?: ' '
                print(" $symbol ")
                if (col != 3) print("|")
            }
            println()
            if (row != 3) println("---|---|---")
        }
    }
}

fun main() {
    val game = TicTacToe()

    println(game.makeMove('X', 1, 1))
    game.printBoard()
    println(game.makeMove('O', 1, 1))
    game.printBoard()
    println(game.makeMove('O', 2, 2))
    game.printBoard()

    println(game.checkWinner())
    println(game.isBoardFull())

    println(game.makeMove('X', 1, 2))
    game.printBoard()
    println(game.makeMove('O', 1, 3))
    game.printBoard()
    println(game.makeMove('X', 2, 1))
    game.printBoard()

    println(game.checkWinner())
    println(game.isBoardFull())

    println(game.makeMove('O', 3, 1))
    game.printBoard()
    println(game.makeMove('X', 3, 2))
    game.printBoard()
    println(game.makeMove('O', 2, 3))
    game.printBoard()
    println(game.makeMove('X', 3, 3))
    game.printBoard()

    println(game.checkWinner())
    println(game.isBoardFull())
}
