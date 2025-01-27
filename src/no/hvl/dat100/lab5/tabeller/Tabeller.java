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


	// c1) - for-løkke
	public static int summer(int[] tabell) {

		int Tall[] = { 42, 67, 89 };
		int sum = 0;

		for (int i : Tall)
			sum += i;

		System.out.println("Summen av tabellen er: " + sum);
		return sum;

	}

	// c2 - utvidet for-løkke
	public static int summer1(int[] tabell) {

		int Tall1[] = { 42, 67, 89 };
		int sum = 0;

		for (int i = 0; i < Tall1.length; i++) {

			System.out.println("Sum1 av tabellen er: " + sum);

		}

		return sum;

	}

	// c3 - while-løkke
	public static int summer2(int[] tabell) {

		int i = 0;
		int Tall3[] = { 42, 67, 89 };

		while (i < Tall3.length) {

			i++;

		}

		System.out.println("Sum2 av tabellen er: " + i);
		return i;

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

			
			int [] itab = new int [] {tall, -1, -1};  
		

			System.out.println(itab);
			return tall;
	    }  

	


	// f)
	public static int[] reverser(int[] tabell) {

		String stringInput = "1234567";

		int iStrLength = stringInput.length();

		for (iStrLength = stringInput.length(); iStrLength > 0; --iStrLength)

		{

		System.out.println(stringInput.charAt(iStrLength - 1));

		}
		
		return tabell;

	}
	// g)
	public static boolean erSortert(int[] tabell) {

		boolean erSortert = true; 
		int i = 0; 
		while  ( (i < tabell.length - 1) && erSortert){ 
			if (tabell[i] > tabell[i + 1]) { 
				erSortert = false; 
				
			}
			i++; 
		}
		return erSortert;

	}

	// h)

	
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyLengde = tabell1.length + tabell2.length;
		int[] newTabell = new int[nyLengde];
		for (int i=0; i<tabell1.length; i++) {
			newTabell[i] = tabell1[i];
		}
		
		for (int j = 0; j<tabell1.length; j++) {
			newTabell[tabell1.length+j] = tabell2[j];
		}
		
		return newTabell;
		
	} 
	
	
}
