
public class CalcNbImpairs {
	
	public static void main(String[] args) {
		int max=100;
		int debut = 5;
		while(debut<=max) {
			long result = CalcNbImpairRecursif(debut);
			System.out.println("façon 1: "+ debut + "e nombre impair: " + result);
			long result2 = CalcNbImpairRecursif(debut,1,1,1);
			System.out.println("façon 2: "+ debut + "e nombre impair: " + result2);
			debut+=5;
		}
		
	}
	
	public static int CalcNbImpairRecursif(int k) {
		
		if(k<4) return 1;
		else return CalcNbImpairRecursif(k-1) + CalcNbImpairRecursif(k-2) + CalcNbImpairRecursif(k-3);
		
	}
	
	
public static int CalcNbImpairRecursif(int k, int a, int b, int c) {
		
		if(k==1) return a;
		if(k==2) return b;
		if(k==3) return c;
		else return CalcNbImpairRecursif(k-1, b , c , a+b+c);
		
	}
	

}
