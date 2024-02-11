package pathValidators;

import board.Board;

public class diagonalPathValidator implements PathValidator {


    @Override
    public Boolean pathValidate(Board board, int rowStart, int colStart, int rowEnd, int colEnd) {
        if(Math.abs(rowEnd-rowStart) != Math.abs(colEnd-colStart)){
            return false;
        }
        int col= Integer.min(colEnd,colStart)+1;

        int rowLarger = Integer.max(rowEnd,rowStart);
        int rowSmaller= Integer.min(rowEnd,rowStart);

        for(int row = rowSmaller+1; row<rowLarger; row++){
            System.out.println(row+ " "+col);
            if(!board.checkIfEmpty(row,col)){

                System.out.println(board.checkIfEmpty(row,col));
                return false;
            }
            col++;
        }
        return true;
    }
}
