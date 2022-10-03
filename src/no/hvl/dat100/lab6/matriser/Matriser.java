package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int i = 0; i<matrise.length; i++) {
			for (int j = 0; j<matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
				System.out.println(); 
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		int[][] matrise1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		String utTxt = skriv(matrise1) + "\n";
		showMessageDialog(null, utTxt);
		return utTxt;

	}

	public static String skriv(int[][] tab) {
		String txt = "";
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab.length; j++)
				txt += tab[i][j] + "  ";
			txt += "\n";
		}
		return txt;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] skalertMatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {

			skalertMatrise[i] = new int[matrise[i].length];

			for (int j = 0; j < matrise[i].length; j++) {

				skalertMatrise[i][j] = matrise[i][j] * tall;

			}

		}
		return skalertMatrise;
	}



	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length || a[0].length != b[0].length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;

	}
}
