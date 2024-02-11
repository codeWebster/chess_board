package service;

import Player.Player;
import board.Board;
import places.Piece;

public class ChessService {
    private Board board;

    public ChessService(Board board) {
        this.board = board;
    }
    public void movePiece(Piece piece, Player player, int rowStart, int colStart, int rowEnd, int colEnd){
        if(!piece.validateMove(board, player,  rowStart,  colStart,  rowEnd,  colEnd )){
            System.out.println("Invalid Move");
            return;
        }
        if(!board.checkIfEmpty(rowEnd,colEnd)){
            System.out.println(rowEnd + " " + colEnd);
            System.out.println(board.getPiece(rowEnd,colEnd).getClass() + " Killed");
        }
        board.putPiece(rowEnd, colEnd, piece);
        board.removePiece(rowStart,colStart);
    }
}
