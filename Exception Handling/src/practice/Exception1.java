package practice;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x = 10;
		float y = 3;
		float res=0;
		
		
		try {
		res = x/y;
		System.out.println("Result : "+res);
		}catch(ArithmeticException e) {
			System.out.println("div 0");
		}catch(Exception e) { //you cannot do any more exceptions after parent 
			System.out.println("unhandled");
		}finally {
			System.out.println("Result is "+res);
		}
		
		System.out.println("other lines");

	}

}
