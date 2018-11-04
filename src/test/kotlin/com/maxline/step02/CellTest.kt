package com.maxline.step02

import org.junit.Assert.assertEquals
import org.junit.Test as test

class CellTest {

    @test fun isCurrentStateAlive() {
        var cell = Cell(1, 1)
        cell.setAliveState()
        assertEquals(CellState.ALIVE, cell.getCurrentState())
    }

    @test fun isNextStateAlive() {
        var cell = Cell(1, 1)
        cell.setAliveNextState()
        assertEquals(CellState.ALIVE, cell.getNextState())
    }
}