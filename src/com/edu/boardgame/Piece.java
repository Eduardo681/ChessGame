package com.edu.boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    public Piece(){}

    protected Board getBoard() {
        return board;
    }
}
