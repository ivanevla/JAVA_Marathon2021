package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] pieces = new ChessPiece[8];

        for (int i = 0; i < pieces.length; i++) {
            if (i < 4) pieces[i] = ChessPiece.PAWN_WHITE;
            if (i >= 4) pieces[i] = ChessPiece.ROOK_BLACK;
        }

        Arrays.stream(pieces).forEach(piece -> System.out.print(piece + " "));
    }
}