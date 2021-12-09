package chess;

import boardgame.Position;

public class ChessPosition {
	private char colums;
	private int rows;

	public ChessPosition(char colums, int rows) {
		if (colums < 'a' || colums > 'h' || rows < 1 || rows > 8) {
			throw new ChessException(" Error intantiating ChessPosition: valid values are from a1 to h8");
		}
		this.colums = colums;
		this.rows = rows;
	}

	public char getColums() {
		return colums;
	}

	public int getRows() {
		return rows;
	}
	protected Position toPosition () {
	return new Position(8 - rows ,colums - 'a');
	}
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColum()), 8 - position.getRow());
	}
	@Override
	public String toString () {
		return "" + colums + rows;
	}
}
