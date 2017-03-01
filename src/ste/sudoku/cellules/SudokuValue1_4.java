package ste.sudoku.cellules;

import ste.sudoku.interfaces.SudokuValue;

public enum SudokuValue1_4 implements SudokuValue{
	VAL_1("1"), VAL_2("2"), VAL_3("3"), VAL_4("4");

	private String display;

	// constructeur toujours en private pour un enum
	private SudokuValue1_4(String display) {
		this.display = display;
	}

	@Override
	public String toString() {
		return this.display;
	}
}
