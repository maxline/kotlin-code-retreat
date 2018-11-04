package com.maxline.step02


data class Cell(val row: Int, val col: Int) {
    private var state: CellState = CellState.DEAD;
    private var nextState: CellState = CellState.DEAD

    fun setAliveState() {
        this.state = CellState.ALIVE;
    }

    fun getCurrentState(): CellState {
        return state;
    }

    fun getNextState(): CellState {
        return nextState;
    }

    fun setAliveNextState() {
        this.nextState = CellState.ALIVE

    }
}