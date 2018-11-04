package com.maxline.step02

import org.junit.Assert.*
import org.junit.Test as test

class BoardTest {
    @test fun boardShouldBeEmpty_WhenItCreated() {
        var board = Board()
        assertTrue(board.isEmpty())
    }

    @test fun addCell_boardShouldNotBeEmpty_WhenCellAdded() {
        var board = Board();
        board.addCell(Cell(1, 1))
        assertFalse(board.isEmpty())
    }

    @test fun calculateNeighbours_shouldReturnZero_WhenCellIsAlone() {
        var board = Board();
        board.addCell(Cell(1, 1))
        assertEquals(0, board.calculateNeighbours(1, 1))
    }

    @test fun isNeighbour_ShouldReturnFalseWhenDistanceMoreThenOne() {
        assertEquals(false, Board().isNeighbour(Cell(1, 1), Cell(1, 3)))
    }

    //TODO create converter to matrix for easily presentation of board cells
    @test fun calculateNeighbours_shouldReturnTree() {
        var board = Board();

        board.addCell(Cell(0, 0))
        board.addCell(Cell(1, 1))
        board.addCell(Cell(1, 0))
        board.addCell(Cell(1, 2))

        assertEquals(3, board.calculateNeighbours(1, 1))
    }

    @test fun isNeighbour_ShouldReturnTrueWhenDistanceLessEqualsOne() {
        assertEquals(true, Board().isNeighbour(Cell(1, 1), Cell(1, 2)))
    }

    //TODO add test if cellOne == cellTwo
}