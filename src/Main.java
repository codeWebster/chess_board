import Player.Player;
import board.Board;
import board.ResetBoardStrategy;
import places.Piece;
import service.ChessService;

public class Main {
    public static void main(String args[]){
        Board board = new Board();
        ChessService chessService = new ChessService(board);
        ResetBoardStrategy resetBoardStrategy = new ResetBoardStrategy();
        resetBoardStrategy.resetBoard(board);
        Player slave = Player.white;
        Player nigga = Player.black;
        Piece piece = board.getPiece(0,0);
        System.out.println(board.getPiece(4,4).getClass());
        chessService.movePiece(piece, nigga, 0,0,4,4);

    }
}
