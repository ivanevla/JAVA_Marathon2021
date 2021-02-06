package day17;

public class Task2 {
    public static void main(String[] args) {
        char[][] chars = new char[8][8];
        chars[0][0] = ChessPiece.ROOK_BLACK.getSybmol();
        chars[0][5] = ChessPiece.ROOK_BLACK.getSybmol();
        chars[0][6] = ChessPiece.KING_BLACK.getSybmol();
        chars[1][1] = ChessPiece.ROOK_WHITE.getSybmol();
        chars[1][4] = ChessPiece.PAWN_BLACK.getSybmol();
        chars[1][5] = ChessPiece.PAWN_BLACK.getSybmol();
        chars[1][7] = ChessPiece.PAWN_BLACK.getSybmol();
        chars[2][0] = ChessPiece.PAWN_BLACK.getSybmol();
        chars[2][2] = ChessPiece.KNIGHT_BLACK.getSybmol();
        chars[2][6] = ChessPiece.PAWN_BLACK.getSybmol();
        chars[3][0] = ChessPiece.QUEEN_BLACK.getSybmol();
        chars[3][3] = ChessPiece.BISHOP_WHITE.getSybmol();
        chars[4][3] = ChessPiece.BISHOP_BLACK.getSybmol();
        chars[4][4] = ChessPiece.PAWN_WHITE.getSybmol();
        chars[5][4] = ChessPiece.BISHOP_WHITE.getSybmol();
        chars[5][5] = ChessPiece.PAWN_WHITE.getSybmol();
        chars[6][0] = ChessPiece.PAWN_WHITE.getSybmol();
        chars[6][3] = ChessPiece.QUEEN_WHITE.getSybmol();
        chars[6][5] = ChessPiece.PAWN_WHITE.getSybmol();
        chars[6][7] = ChessPiece.PAWN_WHITE.getSybmol();
        chars[7][5] = ChessPiece.ROOK_WHITE.getSybmol();
        chars[7][6] = ChessPiece.KING_WHITE.getSybmol();

        ChessBoard chessBoard = new ChessBoard(chars);
        chessBoard.print();
    }
}
