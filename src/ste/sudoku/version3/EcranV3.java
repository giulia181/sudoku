package ste.sudoku.version3;

import ste.sudoku.interfaces.Ecran;
import ste.sudoku.interfaces.Sudoku;

public class EcranV3 implements Ecran {
	
	private static String format;
	static {
		StringBuilder sb = new StringBuilder();
		sb.append("+-----------------------+       +-----------------------+").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("+-----------------------+       +-----------------------+").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("+-----------------------+-------+-----------------------+").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("+---------------+-----------------------+---------------+").append(System.lineSeparator());
		sb.append("                | . . . | . . . | . . . |                ").append(System.lineSeparator());
		sb.append("                | . . . | . . . | . . . |                ").append(System.lineSeparator());
		sb.append("                | . . . | . . . | . . . |                ").append(System.lineSeparator());
		sb.append("+---------------+-----------------------+---------------+").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("+-----------------------+-------+-----------------------+").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("+-----------------------+       +-----------------------+").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("+-----------------------+       +-----------------------+").append(System.lineSeparator());
		
		format = sb.toString();
		//le % indique que l'on doit remplacer cette chaine, le 1 indique le nombre de caractères à générer,
		// le d indique qu'il s'agit d'un nombre
//		format = format.replace(".", "%1d");
		//ou
		format = format.replace(".", "%d");
//		System.out.println(format);
	}

	@Override
	public void afficheTitre() {
		System.out.println("SUDOKU V3");
		System.out.println("=========");
	}

	@Override
	public void afficheSudoku(Sudoku sudo) {
		Byte[] values = new Byte[369];
		int pos = 0;
		for (int i = 0; i < 21; i++) {
			for (int j = 0; j < 21; j++) {
				byte val =sudo.getValue(i, j);
				if(val>=0){
					values[pos++]=val;
				}
			}
		}		
		System.out.println(String.format(format, values));

	}

}
