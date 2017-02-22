
package ste.sudoku;

import ste.sudoku.exceptions.InvalidSudokuValueException;
import ste.sudoku.exceptions.OutOfSudokuException;
import ste.sudoku.fabriques.AbstractSudokuFactory;
import ste.sudoku.interfaces.Ecran;
import ste.sudoku.interfaces.Sudoku;

public class Main {
	


	public static void main(String[] args) {
		System.out.println("==============================");
		scenario(AbstractSudokuFactory.VERSION1);
		System.out.println("==============================");
		scenario(AbstractSudokuFactory.VERSION2);
		System.out.println("==============================");
		scenario(AbstractSudokuFactory.VERSION3);
		System.out.println("==============================");
		
	}
	
	public static void scenario(int type) {
		System.out.println("Main.scenario()");
		AbstractSudokuFactory factory = AbstractSudokuFactory.getFactory(type);

		Sudoku sudo = factory.createSudoku();
		Ecran ecran = factory.createEcran();
		byte[][] action = new byte[][] { { 1, 0, 0 }, { 2, 1, 1 }, { 3, 2, 2 },
				{ 4, 3, 3 }, { 5, 1, 3 }, { 6, 2, 3 }, };

		for (byte[] act : action) {
			try {
				System.out.print(String.format("ajout de %s en %s, %s : ", act[0], act[1], act[2]));
				sudo.setValue(act[0], act[1], act[2]);
				System.out.println("OK");
			} catch (OutOfSudokuException e) {
				System.out.println("position refusée");
			} catch (InvalidSudokuValueException e) {
				System.out.println("valeur refusée");
			}
		}

		ecran.afficheTitre();
		ecran.afficheSudoku(sudo);
	}

}
