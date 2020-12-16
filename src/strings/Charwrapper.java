package strings;

public class Charwrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="GFpp 123 pp %^&";
		int alphas=0,upper=0,lower=0,digit=0,alphanum=0,whitespace=0,special=0;
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(Character.isAlphabetic(c)) {
				alphas++;
			}
			if(Character.isUpperCase(c)) {
				upper++;
			}
			if(Character.isLowerCase(c)) {
				lower++;
			}
			if(Character.isDigit(c)) {
				digit++;
			}
			if(Character.isLetterOrDigit(c)) {
				alphanum++;
			}
			if(Character.isWhitespace(c)) {
				whitespace++;
			}
			if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				special++;
			}
		}
		System.out.println("alpha = "+alphas);
		System.out.println("upper = "+upper);
		System.out.println("lower = "+lower);
		System.out.println("special = "+special);
		

	}

}
