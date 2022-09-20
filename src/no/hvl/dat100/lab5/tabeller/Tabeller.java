package no.hvl.dat100.lab5.tabeller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

public class Tabeller {


	public static void skrivUt (int[] tabell) {		

		for (int i = 0; i < tabell.length; i++) {

		int t = tabell[i];

		System.out.println("Indeks " + i + " inneholder " + t);

		}
	}
}

	// b)
	public static String tilStreng(int[] tabell) {

		
		System.out.print("[ ");
		
		for (int tall : tabell) {
			System.out.print(tall + " ");
		}
		
		System.out.println("]");
		int[] itab = {42,67,89};
		skrivUt(itab);
		return null;
	}

	// c)
	public static int summer(int[] tabell) {

		int Tall[] = {42, 67, 89};
		int sum = 0;

		for (int i : Tall)
		    sum += i;
		
		System.out.println("Sum av tabellen er: " + sum);
		
		return sum;
	}


	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false; 
		int pos = 0; 
		
		while (!funnet && pos < tabell.length) { 
			
			if (tall == tabell[pos]) {
				funnet = true; 

			}
			pos++; 
		}
		return funnet; 
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		 int nummer = 1234567, reverser = 0;

		    for(;nummer != 0; nummer /= 10) {
		      int tall = nummer % 10;
		      reverser = reverser * 10 + tall;
		    }

		    System.out.println("Reversert tall: " + reverser);
			return tabell;
		
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
