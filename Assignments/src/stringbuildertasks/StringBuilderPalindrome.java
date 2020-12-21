package stringbuildertasks;

public class StringBuilderPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =0;
		
		//String s=x+"";
		for (int i = 1000; i <= 9999; i++) {
			String s=i+"";
			if(new StringBuffer(s).reverse().toString().equals(s)) {
				x = i;
				System.out.println(x);
			}
		
		

	}

}}
//Task  - Print all palindromes between 1000 and 9999 with the above style