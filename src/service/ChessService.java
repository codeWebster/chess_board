package service;

import Player.Player;
import board.Board;
import pieceMoveValidator.PieceMoveValidator;
import pieceMoveValidator.PieceMoveValidatorFactory;
import places.Piece;

public class ChessService {
    private Board board;

    public ChessService(Board board) {
        this.board = board;
    }
    private Boolean validateMove(Piece piece, Player player, int rowStart, int colStart, int rowEnd, int colEnd){
        if(player != piece.getPlayer()){
            return false;
        }
        PieceMoveValidatorFactory pieceMoveValidatorFactory = new PieceMoveValidatorFactory();
        PieceMoveValidator pieceMoveValidator = pieceMoveValidatorFactory.createPieceMoveValidator(piece);
        return pieceMoveValidator.pathValidator(board, rowStart, colStart, rowEnd, colEnd);
    }
    public void movePiece(Piece piece, Player player, int rowStart, int colStart, int rowEnd, int colEnd){

        if(!validateMove(piece, player, rowStart, colStart, rowEnd, colEnd)){
            System.out.println("Invalid Move");
            return;
        }

        //
        if(!board.checkIfEmpty(rowEnd,colEnd)){
            System.out.println(rowEnd + " " + colEnd);
            System.out.println(board.getPiece(rowEnd,colEnd).getClass() + " Killed");
        }
        board.putPiece(rowEnd, colEnd, piece);
        board.removePiece(rowStart,colStart);
    }
}
