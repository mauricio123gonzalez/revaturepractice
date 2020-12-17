package stringbuilderbuffer;

public class BufferandBuilder {

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
//task, convert every words last character to uppercase and print back the sentence
}
