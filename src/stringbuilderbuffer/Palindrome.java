package stringbuilderbuffer;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String s1=sb.toString();
		if(s.equals(s1)) {
			System.out.println(s+" is palindrome");
		}else {
			System.out.println(s+" is not pali");
		}
		
		//much more efficient method of doing same thing
		
		int num=101;
		s=num+"";
				
		if(new StringBuffer(s).reverse().toString().equals(s)) {
			//in line object creation, object only used in this line
			System.out.println(s+" is palindrome");
		}else {
			System.out.println(s+" is not palindrome");
		}

	}

}
//Task - print all palindromes between 1000 and 9999 with above style
