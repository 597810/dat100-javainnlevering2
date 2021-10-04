package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

	for (int i = 0; i<tabell.length; i++)	{
	 
	double v = tabell[i];	
	
	System.out.println(v);
	}	
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String resultat = "[";
		for ( int i = 0; i < tabell.length; i++) {
		resultat+=tabell[i];	
		if (i!=tabell.length-1); {
		resultat+=",";
		}	
	}
		return resultat +"]";
		
}		
	// c)
	public static int summer(int[] tabell) {
	int totalverdi = 0;	
	
	for (int i = 0; 1 <tabell.length; i++) {
	totalverdi +=tabell[i];
	}	
	return totalverdi;	
	}
	
	
	
	// c2)
	public static int summer1(int[] tabell) {
	int totalverdi = 0;	
	int index = 0;
	
	while(index <tabell.length) {
	totalverdi+=tabell[index];	
	
	}
	return totalverdi;
	
	}
	
	// c3)
	public static int summer2(int[] tabell) {
		int totalverdi = 0;
		
		for (int nummer:tabell) {
			totalverdi+=nummer;
		}
		
		return totalverdi;
	}
	

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean funnet = false;
		int pos = 0;
		while (!funnet && pos < tabell.length) {
			
			if ( tall == tabell[pos])  {
				funnet = true;
			}
			
			pos ++;
		}
		
		return funnet;
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
	
	// TODO
			throw new UnsupportedOperationException("posisjontall ikke implemetert");
		
		}
		

	

	// f)
	public static int[] reverser(int[] tabell) {
		
	for (int i = 0; 1 <tabell.length /2; i++) 
	{	
		int tmp = tabell[i];
		tabell[i] = tabell[tabell.length - i -1];
	}
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int i = 0;
		boolean sortert = true;
		while (sortert && i <tabell.length -1) {
			if(tabell[i] > tabell[i+1]) {
				sortert=false;
			}
			i++;
		}
		return sortert;
	}
		
		
			
	// h)
	
		public static int[] settSammen(int[] tabell1,int[] tabell2) {
			  int[] nytabell = new int[tabell1.length + tabell2.length];

			    for (int i = 0; i < tabell1.length; i++) {
			        nytabell[i] = tabell2[i];
			    }

			    for (int i = 0; i < tabell1.length; i++) {
			        nytabell[tabell1.length + i] = tabell2[i];
		
			    }
			    
		}
}