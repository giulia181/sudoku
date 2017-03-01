package ste.sudoku.fabriques;

import ste.sudoku.cellules.Cell1_4;
import ste.sudoku.fabriques.AbstractSudokuFactory;
import ste.sudoku.interfaces.Ecran;
import ste.sudoku.interfaces.Sudoku;
import ste.sudoku.version2.EcranV2;
import ste.sudoku.version2.SudokuV2;

public class SudokuFactoryV2 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		SudokuV2 sudo = new SudokuV2();
		Cell1_4[][] grid = new Cell1_4[sudo.getLineSize()][sudo.getColumnSize()];
		sudo.setGrid(grid);
		for (int i = 0; i < sudo.getLineSize(); i++) {
			for (int j = 0; j < sudo.getColumnSize(); j++) {
				if(sudo.isValidPosition(i,j)){
					grid[i][j]=new Cell1_4();
				}
			}
		}		
		return sudo;
	}

	@Override
	public Ecran createEcran() {
		return new EcranV2();
	}

}
