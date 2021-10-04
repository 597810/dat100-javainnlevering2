package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
	for (int [] rad : matrise ) {
		for (int v : rad) {
		System.out.println( v + "  ");	
		}
	}
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String string1= " ";
		for ( int i = 0; i <matrise.length; i++) {
		 for (int j = 0; j < matrise.length; j++) {	
			 if ( i!= matrise.length) {
				 string1 +=matrise[i][j];
			 }
		 }
		}
		return string1;
	}
		

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
