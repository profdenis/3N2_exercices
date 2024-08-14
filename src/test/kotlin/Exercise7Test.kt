package exercices3N2

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Exercise7Test {
    @Test
    fun testTicTacToe() {
        val game = TicTacToe()

        assertTrue(game.makeMove('X', 0, 0))
        assertFalse(game.makeMove('O', 0, 0))
        assertTrue(game.makeMove('O', 1, 1))

        assertEquals(null, game.checkWinner())

        game.makeMove('X', 0, 1)
        game.makeMove('X', 0, 2)

        assertEquals('X', game.checkWinner())

        assertTrue(game.isBoardFull())
    }
}