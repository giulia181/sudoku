package ste.sudoku.interfaces;

public interface Sudoku {

	public void setValue(byte i, int line, int column);

	public byte getValue(int line, int column);

}