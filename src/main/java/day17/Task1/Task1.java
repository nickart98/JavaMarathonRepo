package day17.Task1;

import day17.ChessPiece;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] figures = new ChessPiece[8];
        for (int i = 0; i < figures.length; i++) {
            if (i < 4) figures[i] = ChessPiece.PAWN_WHITE;
            else figures[i] = ChessPiece.ROOK_BLACK;
            System.out.print(figures[i].getDesignation() + " ");
        }
    }
}
