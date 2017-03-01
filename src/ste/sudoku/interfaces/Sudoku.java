package ste.sudoku.interfaces;

import ste.sudoku.exceptions.InvalidSudokuValueException;
import ste.sudoku.exceptions.OutOfSudokuException;

public interface Sudoku {

public Cell getCell(int line, int column) throws OutOfSudokuException;
	
	public int getLineSize();

	public int getColumnSize();

	public boolean isValidPosition(int line, int column);

	public SudokuValue[] getValidValue();
	
	public void setGrid (Cell[][] grid);
}