package ste.sudoku.version3;

import ste.sudoku.heritage.AbstractSudoku;

public class SudokuV3 extends AbstractSudoku {
	
	public SudokuV3() {
		super(21, 21, new byte[] { 1, 2, 3, 4,5,6,7,8,9 });
		// TODO Auto-generated constructor stub
	}

	public boolean isValidPosition(int line, int column) {
		boolean isValid = super.isValidPosition(line, column); 
		if(column>8 && column<12){
			isValid = !(line<6 || line>14);
		}else if(line>8 && line<12){
			isValid = !(column<6 || column>14);
		}
		
		return isValid;
	}

	
}
