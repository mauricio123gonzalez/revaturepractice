package controlstructures;

public class Nestedloop {
	
		public static void main(String[] args) {
			
			for (int i = 0; i < 3; i++) { // each loop of i has all of those j loops
				for (int j = 0; j < 5; j++) {
					System.out.println("i = "+i+" j = "+j);
				}
			}
		}

}
