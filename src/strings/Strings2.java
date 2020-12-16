package strings;

import java.util.Arrays;

public class Strings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="hello";
		System.out.println("s1 = "+s1);
		System.out.println("upper "+s1.toUpperCase());
		System.out.println("s1 = "+s1);
		s1=s1.toUpperCase();
		System.out.println("s1 = "+s1);
		
		System.out.println("length "+s1.length());
		System.out.println("0 "+s1.charAt(0));
		
		System.out.println("s1 =  : "+s1.equals("HELLO"));
		System.out.println("s1 =  : "+s1.equals("HelLO"));
		
		System.out.println("contains L "+s1.contains("L"));
		System.out.println("contains L "+s1.contains("LOL"));
		
		char c[]=s1.toCharArray();
		System.out.println(Arrays.toString(c));
		
		System.out.println("s1 sub 2 "+s1.substring(2));
		System.out.println("s1 sub 2,4 "+s1.substring(2,4));
		
		System.out.println("s1 lower "+s1.toLowerCase());
		
		String s2="Hello it is lunch time";
		String ar[]=s2.split(" ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		String s3="          hi";
		System.out.println(s3);
		s3=s3.trim();
		System.out.println(s3);

	}

}
