package pieceMoveValidator;

import board.Board;
import pathValidators.PathValidator;
import pathValidators.StraightPathValidator;

public class RookMoveValidator implements PieceMoveValidator{
    @Override
    public Boolean pathValidator(Board board, int rowStart, int colStart, int rowEnd, int colEnd) {
        PathValidator pathValidator = new StraightPathValidator();
        return pathValidator.pathValidate(board, rowStart, colStart, rowEnd, colEnd );
    }
}
