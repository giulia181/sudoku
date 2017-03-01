package ste.sudoku.version1;

import ste.sudoku.cellules.SudokuValue1_9;
import ste.sudoku.heritage.AbstractSudoku;

public class SudokuV1 extends AbstractSudoku {
	
	public SudokuV1() {
		super(9, 9, SudokuValue1_9.values());
	}


}
