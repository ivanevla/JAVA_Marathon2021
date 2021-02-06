package day17;

public class Task1 {
    public static void main(String[] args) {
        char[] chars = new char[8];

        for (int i = 0; i < chars.length; i++) {
            if (i < 4) chars[i] = ChessPiece.PAWN_WHITE.getSybmol();
            if (i >= 4) chars[i] = ChessPiece.ROOK_BLACK.getSybmol();
        }

        System.out.println(chars);
    }
}