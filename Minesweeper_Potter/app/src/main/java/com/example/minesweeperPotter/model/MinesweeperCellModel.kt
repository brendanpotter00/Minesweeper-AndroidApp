package com.example.minesweeperPotter.model

object MinesweeperCellModel {
    public val BOMB: Int = -1
    public val BLANK: Int = 0

    private var value: Int = 0

    public var revealed : Boolean = false
    public var flagged : Boolean = false

    fun getValue() = value

    fun isRevealed(): Boolean {
        return revealed
    }
    fun isFlagged(): Boolean {
        return flagged
    }

    fun setRevealed1(r: Boolean) {
        revealed = r
    }

    fun setFlagged1(f: Boolean) {
        flagged = f
    }


}