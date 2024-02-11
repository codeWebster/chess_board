package board;

import Player.Player;
import places.Queen;

public class ResetBoardStrategy {
    public void resetBoard(Board board){
        Queen queenW = new Queen(Player.white);
        Queen queenB = new Queen(Player.black);
        board.putPiece(0,0,queenB);
        board.putPiece(4,4,queenW);
    }
}
