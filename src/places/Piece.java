package places;

import Player.Player;
import board.Board;

public abstract class Piece {
    private Player player;

    public Piece (Player player){
        this.player = player;
    }

    abstract Boolean validatePath(Board board, int rowStart, int colStart, int rowEnd, int colEnd);
    public Boolean validateMove(Board board, Player player, int rowStart, int colStart, int rowEnd, int colEnd){
        if(player != this.player){
            return false;
        }
        return validatePath(board, rowStart,rowEnd, rowEnd, colEnd);

    }
}
