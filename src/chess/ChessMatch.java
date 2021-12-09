package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialsetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColums()];
		for (int i = 0; i < board.getColums(); i++) {
			for (int j = 0; j < board.getColums(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	private void placeNewPiece(char colums , int rows,ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(colums, rows).toPosition());
	}
	
	private void initialsetup() {
		placeNewPiece('b',6,new Rook(board,Color.WHITE));
		placeNewPiece('e',8,new King(board,Color.BLACK));
		placeNewPiece('e',1,new King(board,Color.BLACK));
	
	}

}
