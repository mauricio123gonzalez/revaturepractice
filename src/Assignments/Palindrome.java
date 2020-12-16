package Assignments;
//Create class with method which checks if the value is pallindrome or not
public class Palindrome {
	
    public static void main(String args[]) { //testing the function
    	String a = "adda";
    	String b = "bad";
        System.out.println("Is "+a+" a palindrom?: " 
                + isPalindromString(a));
        System.out.println("Is "+b+" a palindrom?: " 
                + isPalindromString(b));
    }
    public static boolean isPalindromString(String text){ //define main method
       String reverse = reverse(text); //variable that is the text reversed
       if(text.equals(reverse)){ //if statement that tests text against reversed text
           return true;
       }
       return false;
    }
    public static String reverse(String input){ //defining reverse method
        if(input == null || input.isEmpty()){ 
            return input;
        }
        return input.charAt(input.length()- 1) 
                   + reverse(input.substring(0, input.length() - 1)); //the actual reversing
    }
   
}
// not efficient, should do this more tonight and learn more string commands
// refer to palindromepractice to see better code from classmate