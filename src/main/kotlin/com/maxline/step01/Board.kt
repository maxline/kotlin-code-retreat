package com.maxline

class Board {

    var cells: Array<IntArray> = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0)
    )

    fun addAliveRowCol(row: Int, col: Int) {
        cells[row][col] = 1
    }

    fun countNeighbours(row: Int, col: Int): Int {
        var count = 0;
        for (row in cells.indices) {
            count += cells[row].sum()
        }
        count -= cells[row][col]

        return count
    }

    fun countNeighbours1(row: Int, col: Int): Int {
        var neighboursCount = 0;
        cells.forEach {
            neighboursCount += it.sum();
        }
        return neighboursCount - cells[row][col];
    }

    fun nextState(row: Int, col: Int): Int {
        val countNeighbours = countNeighbours(row, col)

        //TODO replace by when?
        if (countNeighbours == 3) {
            return 1;
        } else if (countNeighbours == 2) {
            return cells[row][col];
        }
        return 0;
    }
}