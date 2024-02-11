package places;

import Player.Player;
import board.Board;
import pathValidators.PathValidator;
import pathValidators.StraightPathValidator;

public class Rook extends Piece {
    public Rook(Player player) {
        super(player);
    }

    @Override
    Boolean validatePath(Board board, int rowStart, int colStart, int rowEnd, int colEnd) {
        PathValidator pathValidator = new StraightPathValidator();
        return pathValidator.pathValidate(board, rowStart, colStart, rowEnd, colEnd );
    }
}
