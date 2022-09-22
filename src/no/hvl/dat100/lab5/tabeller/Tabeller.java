package no.hvl.dat100.lab5.tabeller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

public class Tabeller {


	public static void skrivUt (int[] tabell) {
		
		System.out.print("[ ");
		
		int [] tbl = new int [] {1, 2, 3, 4, 5};  
	
        for (int i = 0; i < tbl.length; i++) {  
        	System.out.print(tbl[i] + " ");  
        	
        }  
        
        System.out.println("]");
        skrivUt(tbl);// koden kommer mange ganger når vi bruker skrivUt
    }  
	// b)
	public static String tilStreng(int[] tabell) {
		
		System.out.print("[");
		
		int [] Table = new int [] {42, 67, 89};  
		
        for (int i = 0; i < Table.length; i++) {  
        	System.out.print(Table[i] + " ");  
        	
        }  
        System.out.println("]");
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
		
		int i = 0;
		while (!funnet && i < tabell.length) {

			if (tabell[i] > tall) {
				funnet = true;

			}

			i++;
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

		String stringInput = "1234567"; 
		
				int iStrLength=stringInput.length(); 
		
		for(iStrLength=stringInput.length();iStrLength>0;--iStrLength) 
			
			{ 
			
			System.out.print(stringInput.charAt(iStrLength-1));
			
		}
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
