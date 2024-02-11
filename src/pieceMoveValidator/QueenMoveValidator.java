package pieceMoveValidator;

import board.Board;
import pathValidators.PathValidator;
import pathValidators.StraightPathValidator;
import pathValidators.diagonalPathValidator;

public class QueenMoveValidator implements PieceMoveValidator{
    @Override
    public Boolean pathValidator(Board board, int rowStart, int colStart, int rowEnd, int colEnd) {
        PathValidator pathValidator1 = new StraightPathValidator();
        PathValidator pathValidator2 = new diagonalPathValidator();
        return pathValidator1.pathValidate(board,rowStart, colStart, rowEnd, rowStart)
                || pathValidator2.pathValidate(board,rowStart, colStart, rowEnd, rowStart);
    }
}
