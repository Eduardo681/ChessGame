package com.edu.chess.pieces;

import com.edu.boardgame.Board;
import com.edu.chess.ChessPiece;
import com.edu.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }
}
