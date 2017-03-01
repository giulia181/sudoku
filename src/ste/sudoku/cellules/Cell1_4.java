package ste.sudoku.cellules;

import ste.sudoku.exceptions.InvalidSudokuValueException;
import ste.sudoku.interfaces.Cell;
import ste.sudoku.interfaces.SudokuValue;

public class Cell1_4 implements Cell {
	
	SudokuValue1_4 val;
	
	@Override
	public SudokuValue getValue() {
		
		return this.val;
	}
	
	@Override
	public void setValue(SudokuValue val) throws InvalidSudokuValueException {
		if(!(val instanceof SudokuValue1_4))throw new InvalidSudokuValueException(String.format(
				"Valeur non valid : %s", val));
		this.val=(SudokuValue1_4) val;
	}

	@Override
	public void setValue(String val) throws InvalidSudokuValueException {
		try{
				setValue( SudokuValue1_4.valueOf("VAL_"+val));
		}catch(IllegalArgumentException e){
			throw new  InvalidSudokuValueException(String.format(
					"Valeur non valid : %s", val));
		}
			 
	}
	
}
