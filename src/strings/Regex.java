package strings;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Regular Expression
		//Short had of writing and expression using some wild cards
		//which would match the pattern and give the result
		//[] - to write an expression
		//{} - length
		//^ - not
		//[0-9]{5} any digits of length 5
		//[a-zA-Z]{6} - any word of length 6
		//[a-zA-Z0-9]{2,6} any alphanumeric min length 2 max length 6
		//[A-Z]{1,} minimum 1 uppercase letter, any max
		//[^a-z] anything BUT lowercase letters
		String s = "HG J234j a45 *()--9d lkjDf l p";
		System.out.println(s.replaceAll("[^a-zA-z]", ""));
		System.out.println(s.replaceAll("[^a-z]", ""));
		System.out.println(s.replaceAll("[^A-Z]", ""));
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
		
		String ex="ASDFG1234A";
		//first 5 upper then 3 numbers then upper
		if(ex.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("valid");
		}else {
			System.out.println("fail");
		}
		String n="+1-1234567890"; //validate a phone number
		if(n.matches("\\+1-[0-9]{10}")) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		//task 1 -validate a SSN
		
		
		
		//task 2 -validate a DL
		
		String dl="1234123g4";
		if(dl.matches("[0-9]{8}")) {
			System.out.println("valid dl");
		}else {
			System.out.println("invalid dl");
		}

	}

}
