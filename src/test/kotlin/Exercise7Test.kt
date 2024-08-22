package exercices3N2

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Exercise7Test {
    @Test
    fun testTicTacToe() {
        val game = TicTacToe()

        assertTrue(game.makeMove('X', 1, 1))
        assertFalse(game.makeMove('O', 1, 1))
        assertTrue(game.makeMove('O', 2, 2))
        assertFalse(game.makeMove('O', 1, 0))

        assertEquals(null, game.checkWinner())

        game.makeMove('X', 1, 2)
        game.makeMove('X', 1, 3)

        assertEquals('X', game.checkWinner())

        assertFalse(game.isBoardFull())
    }
}