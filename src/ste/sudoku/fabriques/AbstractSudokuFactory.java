package ste.sudoku.fabriques;

import ste.sudoku.interfaces.Ecran;
import ste.sudoku.interfaces.Sudoku;
import ste.sudoku.fabriques.SudokuFactoryV1;
import ste.sudoku.fabriques.SudokuFactoryV2;
import ste.sudoku.fabriques.SudokuFactoryV3;

public abstract class AbstractSudokuFactory {
	
	public static final int VERSION1 = 1;
	public static final int VERSION2 = 2;
	public static final int VERSION3 = 3;
	
	public static final AbstractSudokuFactory getFactory(int type){
		AbstractSudokuFactory factory = null;
		switch (type) {
		case VERSION1:
			factory = new SudokuFactoryV1();
			break;
		case VERSION2:
			factory = new SudokuFactoryV2();
			break;
		case VERSION3:
			factory = new SudokuFactoryV3();
			break;
		default:
			break;
		}
		return factory;
	}
	public abstract Sudoku createSudoku();
	public abstract Ecran createEcran();
}
