package ste.sudoku.fabriques;

import ste.sudoku.fabriques.AbstractSudokuFactory;
import ste.sudoku.interfaces.Ecran;
import ste.sudoku.interfaces.Sudoku;
import ste.sudoku.version2.EcranV2;
import ste.sudoku.version2.SudokuV2;

public class SudokuFactoryV2 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		return new SudokuV2();
	}

	@Override
	public Ecran createEcran() {
		return new EcranV2();
	}

}
