package com.maxline.step01

import org.junit.Assert.assertEquals
import org.junit.Test as test

class BoardTest {
    // TODO initialization of array to init
    @test fun boardCanBeInitializedWithAliveCells() {
        val board: Board = Board()
        // TODO fix of direct initialization
        board.cells = arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(1, 1, 1),
                intArrayOf(0, 0, 0)
        )

        assertEquals(board.cells[1][1], 1)
    }

    @test fun addAliveRowCol_AddAliveCellToBoard() {
        val board: Board = Board()

        board.cells = arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 0, 0),
                intArrayOf(0, 0, 0)
        )

        board.addAliveRowCol(1, 1)

        assertEquals(board.cells[1][1], 1)
        assertEquals(board.cells[0][0], 0)
    }

    @test fun countNeighbours_ShouldReturnNumberOfNeighbours() {
        val board: Board = Board()

        board.cells = arrayOf(
                intArrayOf(1, 0, 1),
                intArrayOf(0, 1, 0),
                intArrayOf(1, 0, 1)
        )

        assertEquals(board.countNeighbours(1, 1), 4)
    }

    @test fun nextState_CellShouldDeadIfNeighboursCountIs0() {
        val board: Board = Board()

        board.cells = arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 1, 0),
                intArrayOf(0, 0, 0)
        )

        assertEquals(board.nextState(1, 1), 0)
    }

    @test fun nextState_CellShouldDeadIfNeghboursCountIs4() {
        val board: Board = Board()

        board.cells = arrayOf(
                intArrayOf(1, 0, 1),
                intArrayOf(0, 1, 0),
                intArrayOf(1, 0, 1)
        )

        assertEquals(board.nextState(1, 1), 0)
    }

    @test fun nextState_CellShouldAliveIfNeghboursCountIs2() {
        val board: Board = Board()

        board.cells = arrayOf(
                intArrayOf(1, 0, 1),
                intArrayOf(0, 1, 0),
                intArrayOf(0, 0, 0)
        )

        assertEquals(board.nextState(1, 1), 1)
    }

    @test fun nextState_CellShouldAliveIfNeghboursCountIs3() {
        val board: Board = Board()

        board.cells = arrayOf(
                intArrayOf(1, 0, 1),
                intArrayOf(0, 0, 0),
                intArrayOf(1, 0, 0)
        )

        assertEquals(board.nextState(1, 1), 1)
    }
}


