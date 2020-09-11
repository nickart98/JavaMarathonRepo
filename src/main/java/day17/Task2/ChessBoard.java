package day17.Task2;

import day17.ChessPiece;

public class ChessBoard {
    private ChessPiece[][] board;

    public ChessBoard(ChessPiece[][] board) {
        this.board = board;
    }
    public void print(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j].getDesignation());
            }
            System.out.println();
        }
    }
}
