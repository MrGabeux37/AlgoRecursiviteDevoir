import java.io.*;
import java.math.BigInteger;

public class Algorithme2 {
	
	public static void main(String[] args) throws IOException {
		
		File Algo2 = new File("TempsAlgorithme2.txt");
		FileWriter FWAlgoecrit2 = new FileWriter(Algo2);
		BufferedWriter Algoecrit2 = new BufferedWriter(FWAlgoecrit2);
		
		int max=100;
		int debut = 5;
		long TempsDebut=0;
		long temps2=0;
		BigInteger resultat = new BigInteger("0");
		
		while(debut<=max) {
			
      		TempsDebut = System.nanoTime();
      		resultat = CalcNbImpairRecursif(debut,new BigInteger("1"),new BigInteger("1"),new BigInteger("1"));
			temps2=System.nanoTime()-TempsDebut;
			Algoecrit2.write("fa�on 2: "+ debut + "e nombre impair: " + resultat + " Time: " + temps2/1000000 + " ms \n");
			System.out.println("fa�on 2: "+ debut + "e nombre impair: " + resultat + " Time: " + temps2/1000000 + " ms");
			debut+=5;
		}
		
		Algoecrit2.close();
	}
	

	/**
	 * 
	 * @param k est la position du chiffre impair � calculer.
	 * @param a est la valeur de la 3e r�ponse pr�c�dente.
	 * @param b est la valeur de la 2e r�ponse pr�c�dente.
	 * @param c est la valeur de la r�ponse pr�c�dente.
	 * @return La valeur � la position k.
	 */
	
	public static BigInteger CalcNbImpairRecursif(int k, BigInteger a, BigInteger b, BigInteger c) {
		
		if(k==1) return a;
		if(k==2) return b;
		if(k==3) return c;
		else return CalcNbImpairRecursif(k-1, b , c , a.add(b).add(c));
		
	}
	

}
