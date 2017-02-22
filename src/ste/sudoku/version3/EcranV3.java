package ste.sudoku.version3;

import ste.sudoku.heritage.AbstractEcran;
import ste.sudoku.interfaces.Ecran;
import ste.sudoku.interfaces.Sudoku;

public class EcranV3 extends AbstractEcran  {
	
	private static final String titre= "Sudoku V4";
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
		//le % indique que l'on doit remplacer cette chaine, le 1 indique le nombre de caractères à générer, le d indique qu'il s'agit d'un nombre
//		format = format.replace(".", "%1d");
		//ou
		format = format.replace(".", "%d");
//		System.out.println(format);
	}

	public EcranV3() {
		super(format, titre, 369);
	}

}
