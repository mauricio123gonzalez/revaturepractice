package controlstructures;

public class Controlstatements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		
		if(x==10) { // if x is equal to 10
			System.out.println("yes its 10");
			
		}else {
			System.out.println("no its not 10");
		}
		
		if(x==10 || x==9) { // this x is 10 or 9
			System.out.println("yes its 10 or 9");
		}else {
			System.out.println("no its not 10 or 9");
		}
		
		int score=50;
		if(score>=90) {
			System.out.println("top score");
		}else if(score<90 && score >=60) { //if score is below 90 and above 60
			System.out.println("first class");
		}else if(score<60 && score>=50) {
			System.out.println("sorta failure");
		}else {
			System.out.println("big oof");
		}

	}

}
