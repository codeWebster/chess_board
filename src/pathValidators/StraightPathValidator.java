package pathValidators;

import board.Board;

public class StraightPathValidator implements PathValidator{

    @Override
    public Boolean pathValidate(Board board, int rowStart, int colStart, int rowEnd, int colEnd) {
        if (rowEnd != rowStart && colEnd != colStart) {
            return false;
        }
        if (colEnd == colStart) {
            int larger = Integer.max(rowEnd, rowStart);
            int smaller = Integer.min(rowEnd, rowStart);
            for (int i = smaller + 1; i < larger; i++) {
                if (!board.checkIfEmpty(i, colEnd)) {
                    return false;
                }
            }
        }
        if (rowStart == rowEnd) {
            int larger = Integer.max(colEnd, colStart);
            int smaller = Integer.min(colEnd, colStart);
            for (int i = smaller + 1; i < larger; i++) {
                if (!board.checkIfEmpty(rowEnd, i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
