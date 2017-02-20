package ste.sudoku.fabriques;

import ste.sudoku.fabriques.AbstractSudokuFactory;
import ste.sudoku.interfaces.Ecran;
import ste.sudoku.interfaces.Sudoku;
import ste.sudoku.version3.EcranV3;
import ste.sudoku.version3.SudokuV3;

public class SudokuFactoryV3 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		return new SudokuV3();
	}

	@Override
	public Ecran createEcran() {
		return new EcranV3();
	}

}
