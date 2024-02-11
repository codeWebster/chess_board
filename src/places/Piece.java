package places;

import Player.Player;
import board.Board;

public class Piece {
    private Player player;
    pieceType pieceType;
    public Player getPlayer() {
        return player;
    }
    public pieceType getPieceType() {
        return pieceType;
    }
    public Piece(Player player, places.pieceType pieceType) {
        this.player = player;
        this.pieceType = pieceType;
    }
}
