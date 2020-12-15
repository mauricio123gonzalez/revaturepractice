package controlstructures;

public class Primenumberchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		for (int i = 1; i <= 100; i++) { //nested to check prime numbers between 1 and 100
			if(isPrime(i)) {
				System.out.println(i+"");
			}
		}

	}
	
	public static boolean isPrime(int n) {
		boolean b=false;
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if(n% i==0 ) {
				c++;
			}
		}
		
		if(c == 2) {
			b = true;
		}
		return b;
	}

}

//try to recreate this ?
// Create class with method which generates odd numbers between the range
// Create a class with method which generates fibonacci sequence
// Create class with method which checks if the value is pallindrome or not
