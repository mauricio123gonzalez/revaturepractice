package loopstasks;

public class LoopsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orig = "bab";

        String rev = new StringBuilder(orig).reverse().toString();

        if(orig.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");

	}

}}
// 1)Create a class with a method which generates odd numbers between the range.