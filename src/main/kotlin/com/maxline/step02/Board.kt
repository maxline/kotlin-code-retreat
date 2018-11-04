package com.maxline.step02


class Board {

    var cells: MutableList<Cell> = arrayListOf();

    fun isEmpty(): Boolean {
        return cells.isEmpty();
    }

    fun addCell(cell: Cell) {
        cells.add(cell)
    }

    fun calculateNeighbours(row: Int, col: Int): Int {
        var cell = Cell(row, col)
        return cells.filter { item -> isNeighbour(item, cell) }.size - 1
    }

    fun isNeighbour(cellOne: Cell, cellTwo: Cell): Boolean {
        return (cellOne.col - cellTwo.col) <= 1
                && (cellOne.col - cellTwo.col) >= -1
                && (cellOne.row - cellTwo.row) <= 1
                && (cellOne.row - cellTwo.row) >= -1
    }
}