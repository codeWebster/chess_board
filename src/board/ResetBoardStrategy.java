package board;

import Player.Player;
import places.Piece;
import places.pieceType;

public class ResetBoardStrategy {
    public void resetBoard(Board board){
        Piece queenW = new Piece(Player.white, pieceType.Queen);
        Piece queenB = new Piece(Player.black, pieceType.Queen);
        board.putPiece(0,0,queenB);
        board.putPiece(4,4,queenW);
    }
}
