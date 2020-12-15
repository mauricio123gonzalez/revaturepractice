package controlstructures;

public class Loops {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("i = "+i);
		}
		for (int i = 0, j=10; i <10; i++,j--) {
			System.out.println("i = "+i+" j = "+j);
		}
		
		System.out.println("pring even from 1 to 50");
		for (int i = 1; i <= 50; i++) {
			if(i%2==0) { //if the remainder of i is 0 after being divided by 2
				System.out.println(i+" ");
			}
		}
		System.out.println();
		int x=0;
		while (x!=10) { // while x is not equal to 10
			System.out.println("x = "+x);
			x++;
		} //loops for this comment are ENTRY CONTROLLED, condition is checked before loop
		System.out.println("x before do while loop = "+x);
		do {
			System.out.println("i will be exucted once for sure, i am exit controled");
		}while(x!=10);
	}

}
