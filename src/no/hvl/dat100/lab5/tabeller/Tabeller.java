package no.hvl.dat100.lab5.tabeller;

public class Tabeller {


	public static void skrivUt (int[] tabell) {
		
		for (int i = 0; i<tabell.length; i++) {
			
			int t = tabell[i];
			
			System.out.println("indeks" + i + "inneholder" + t);
		}
	}
}

	// b)
	public static String tilStreng(int[] tabell) {

		
		System.out.print("[ ");
		
		for (int tall : tabell) {
			System.out.print(tall + "42,67,89");
		}
		
		System.out.println("]");
		return null; 
	}
		
}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
