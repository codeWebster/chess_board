package pieceMoveValidator;

import places.Piece;
import places.*;

public class PieceMoveValidatorFactory {
    public PieceMoveValidator createPieceMoveValidator(Piece piece){
        if(piece.getPieceType() == pieceType.Queen){
            return new QueenMoveValidator();
        } else if (piece.getPieceType() == pieceType.Rook) {
            return new RookMoveValidator();
        }
        return null;
    }
}
