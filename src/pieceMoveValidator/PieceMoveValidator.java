package pieceMoveValidator;

import board.Board;

public interface PieceMoveValidator {
    public Boolean pathValidator(Board board, int rowStart, int colStart, int rowEnd, int colEnd );
}
