package ste.sudoku.version2;

import ste.sudoku.cellules.SudokuValue1_4;
import ste.sudoku.heritage.AbstractSudoku;

public class SudokuV2 extends AbstractSudoku  {
	
	public SudokuV2() {
		super(4, 4, SudokuValue1_4.values());
	}
}
