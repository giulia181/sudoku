package ste.sudoku.heritage;

import ste.sudoku.exceptions.OutOfSudokuException;
import ste.sudoku.interfaces.Ecran;
import ste.sudoku.interfaces.Sudoku;



public abstract class AbstractEcran implements Ecran {

	private final String format;
	private final String titre;
	private final String line;
	private final int nbValue;
	
	public AbstractEcran(String format, String titre,int nbValue) {
		super();
		this.format = format;
		this.titre = titre;
		StringBuilder builder = new StringBuilder();
		for(int i = titre.length() ; i>0;i--){
			builder.append('=');
		}
		this.line = builder.toString();
		this.nbValue = nbValue;
	}
	
	@Override
	public void afficheTitre() {
		System.out.println(titre);
		System.out.println(line);
	}

	@Override
	public void afficheSudoku(Sudoku sudo) {

		Byte[] valueTab = new Byte[this.nbValue];
		int pos = 0;
		try {
			for (int lig = 0; lig < sudo.getLineSize(); lig++) {
				for (int col = 0; col < sudo.getColumnSize(); col++) {
					if(sudo.isValidPosition(lig, col)){
						valueTab[pos++] = sudo.getValue(lig, col);
					}
				}
			}
			System.out.println(String.format(format, (Object[])valueTab));
		} catch (OutOfSudokuException e) {
			e.printStackTrace();
		}
	}

	
}
