import java.io.*;

public class CalcNbImpairs {
	
	public static void main(String[] args) throws IOException {
		
		File Algo1 = new File("TempsAlgo1.txt");
		File Algo2 = new File("TempsAlgo2.txt");
		
		FileWriter FWAlgoecrit1 = new FileWriter(Algo1);
		FileWriter FWAlgoecrit2 = new FileWriter(Algo2);
		
		PrintWriter Algoecrit1 = new PrintWriter(FWAlgoecrit1);
		PrintWriter Algoecrit2 = new PrintWriter(FWAlgoecrit2);
		
		int max=100;
		int debut = 5;
		long TempsDebut=0;
		long temps1=0;
		long temps2=0;
		
		
		while(debut<=max) {
			TempsDebut = System.nanoTime();
			long result = CalcNbImpairRecursif(debut);
			temps1=System.nanoTime()-TempsDebut;
			Algoecrit1.println("fa�on 1: "+ debut + "e nombre impair: " + result +" Time: " + temps1/1000000 + " ms");
      		System.out.println("fa�on 1: "+ debut + "e nombre impair: " + result +" Time: " + temps1/1000000 + " ms");
      		
      		TempsDebut = System.nanoTime();
			long result2 = CalcNbImpairRecursif(debut,1,1,1);
			temps2=System.nanoTime()-TempsDebut;
			Algoecrit2.println("fa�on 2: "+ debut + "e nombre impair: " + result2 + " Time: " + temps2/1000000 + " ms");
			System.out.println("fa�on 2: "+ debut + "e nombre impair: " + result2 + " Time: " + temps2/1000000 + " ms");
			debut+=5;
		}
		
		Algoecrit1.close();
		Algoecrit2.close();
	}
	
	/** Calcul ternaire. 
	 * Un calcul r�cursif qui va trouver chacunes de 3 r�ponses pr�c�dentes afin de calculer le nombre en question.
	 * 
	 * @param k est la position du chiffre impair � calculer.
	 * @return La valeur � la position k.
	 */
	
	public static int CalcNbImpairRecursif(int k) {
		
		if(k<4) return 1;
		else return CalcNbImpairRecursif(k-1) + CalcNbImpairRecursif(k-2) + CalcNbImpairRecursif(k-3);
		
	}
	
	/**
	 * 
	 * @param k est la position du chiffre impair � calculer.
	 * @param a est la valeur de la 3e r�ponse pr�c�dente.
	 * @param b est la valeur de la 2e r�ponse pr�c�dente.
	 * @param c est la valeur de la r�ponse pr�c�dente.
	 * @return La valeur � la position k.
	 */
	
	public static int CalcNbImpairRecursif(int k, int a, int b, int c) {
		
		if(k==1) return a;
		if(k==2) return b;
		if(k==3) return c;
		else return CalcNbImpairRecursif(k-1, b , c , a+b+c);
		
	}
	

}
