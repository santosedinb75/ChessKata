package com.chess.game

import org.junit.Assert.assertEquals
import org.junit.Test


class BoardTest {

    var board = Board()

    @Test
    fun `the length of the board should be 8 spaces`() {
        val result = board.length
        val expectedResult = 8
        assertEquals(expectedResult, result)
    }

    @Test
    fun `the width of the board should be 8 spaces`() {
        val result = board.width
        val expectedResult = 8
        assertEquals(expectedResult, result)
    }
}