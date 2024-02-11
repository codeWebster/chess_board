package pathValidators;

import board.Board;

public interface PathValidator {
    Boolean pathValidate(Board board, int rowStart, int colStart, int rowEnd, int colEnd);
}
