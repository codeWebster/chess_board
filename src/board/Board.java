package board;

import places.Piece;

public class Board {
    private Piece pieces[][] = new Piece[8][8];
    public void putPiece(int row, int column, Piece piece) {
        pieces[row][column] = piece;
    }
    public void removePiece(int row, int column){
        pieces[row][column] = null;
    }
    public Boolean checkIfEmpty(int row, int column){
        return pieces[row][column] == null;
    }
    public Piece getPiece(int row, int column){
        return pieces[row][column];
    }

}
