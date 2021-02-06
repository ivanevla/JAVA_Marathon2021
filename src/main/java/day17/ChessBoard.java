package day17;

public class ChessBoard {
    private char[][] board;

    public ChessBoard(char[][] board) {
        this.board = board;
        fillEmpties();
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    private void fillEmpties() {
        for (int x = 0; x < this.board.length; x++) {
            for (int y = 0; y < this.board[x].length; y++) {
                if (this.board[x][y] == 0)
                    this.board[x][y] = ChessPiece.EMPTY.getSybmol();
            }
        }
    }

    public void print() {
        for (int x = 0; x < this.board.length; x++) {
            for (int y = 0; y < this.board[x].length; y++) {
                System.out.print(this.board[x][y]);
            }
            System.out.println();
        }
    }
}
