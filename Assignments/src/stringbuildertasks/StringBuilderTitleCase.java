package stringbuildertasks;

public class StringBuilderTitleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello hi good evening how are you doing today";
		StringBuilder sb=new StringBuilder();
		String ar[]=s.split(" ");
		for (int i = 0; i < ar.length - 1; i++) {
			sb.append(Character.toUpperCase(ar[i].charAt(ar[i].length() - 1))); //.append(ar[i].charAt(ar[i].length())).append(" ");
		}
		System.out.println(sb.toString().trim());

	}

}
//Task - Convert every word's last character to uppercase and print back the sentence.
//UNFINISHED