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
		
		// TODO
		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] mat1, int[][] mat2) {
	
	  if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
	        return false;
	    }
	    for(int i = 0; i < mat1.length; i++) {
	        for(int j = 0; j < mat1[i].length; j++) {
	            if (mat1[i][j] != mat2[i][j]) {
	                return false;
	            }
	        }
	    }
	    return true; 
	    		
	    }
    public static void main(String[] args) 
 {
    int[][] a = {{1,4,2},{5,3,9},{3,8,4}};
    int[][] b = {{1,4,2},{5,3,9},{3,8,4}};

    if(erLik(a, b))
    {
    	System.out.println("True");
    	
    }else {
    	System.out.println("False");
    	}
    }
    }
