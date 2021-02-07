package day17;

public class ChessBoard {
    private ChessPiece[][] pieces;

    public ChessBoard(ChessPiece[][] pieces) {
        this.pieces = pieces;
    }

    public void print() {
        for (int x = 0; x < this.pieces.length; x++) {
            for (int y = 0; y < this.pieces[x].length; y++) {
                if (this.pieces[x][y] == null) this.pieces[x][y] = ChessPiece.EMPTY;

                System.out.print(this.pieces[x][y].getSybmol());
            }
            System.out.println();
        }
    }
}
