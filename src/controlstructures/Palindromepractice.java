package controlstructures;

public class Palindromepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "bad";

        String b = new StringBuilder(a).reverse().toString();

        if(a.equals(b)) {
            System.out.println("is palin");
        } else {
            System.out.println("is not");
        }

	}

}
// code from ilana, very good