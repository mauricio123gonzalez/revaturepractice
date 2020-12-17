package Assignments;

public class BufferTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello how are you";
		StringBuilder sb=new StringBuilder();
		String ar[]=s.split(" ");
		for (int i = 0; i < ar.length; i++) {
			sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
		}
		System.out.println(sb.toString().trim());
	}

}
//Task - print all palindromes between 1000 and 9999 with above style
//task, convert every words last character to uppercase and print back the sentence