package ste.sudoku.version1;

import ste.sudoku.interfaces.Ecran;
import ste.sudoku.interfaces.Sudoku;


public class EcranV1 implements Ecran {

	/* (non-Javadoc)
	 * @see ste.sudoku.interfaces.Ecran#afficheTitre()
	 */
	@Override
	public void afficheTitre() {
		System.out.println("SUDOKU");
		System.out.println("======");
	}

	/* (non-Javadoc)
	 * @see ste.sudoku.interfaces.Ecran#afficheSudoku(ste.sudoku.SudokuV1)
	 */
	@Override
	public void afficheSudoku(Sudoku sudo) {
		
		StringBuilder sb = new StringBuilder("+-----------------------+"); 
		sb.append(System.lineSeparator());
		
		for (int l1 = 0; l1 < 3; l1++) {
			for (int l2 = 0; l2 < 3; l2++) {
				sb.append("| ");
				for (int c1= 0; c1 < 3; c1++) {
					for (int c2 = 0; c2 < 3; c2++) {
						sb.append(sudo.getValue((l1*3)+l2, c2+(c1*3))).append(" ");
					}
					sb.append("| ");
				}
				sb.append(System.lineSeparator());
			}
			sb.append("+-----------------------+").append(System.lineSeparator());
		}
		
		
		System.out.println(sb);
	}
}
