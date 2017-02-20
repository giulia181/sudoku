package ste.sudoku.fabriques;

import ste.sudoku.fabriques.AbstractSudokuFactory;
import ste.sudoku.interfaces.Ecran;
import ste.sudoku.interfaces.Sudoku;
import ste.sudoku.version1.EcranV1;
import ste.sudoku.version1.SudokuV1;

public class SudokuFactoryV1 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		return new SudokuV1();
	}

	@Override
	public Ecran createEcran() {
		return new EcranV1();
	}

}
