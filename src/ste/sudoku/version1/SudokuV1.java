package ste.sudoku.version1;

import java.util.Arrays;

import ste.sudoku.heritage.AbstractSudoku;
import ste.sudoku.interfaces.Sudoku;

public class SudokuV1 extends AbstractSudoku {
	
	public SudokuV1() {
		super(9, 9, new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
	}


}
