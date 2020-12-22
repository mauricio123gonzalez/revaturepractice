package arraytasks;

import java.util.Arrays;

public class ArrayDeleteElement {

	public static void main(String[] args) {
		int ar[]= {12,33,11,2,344,11,12,11,22,11,11,23,11,44,11,22,11};
		
		int remove = 1;
		
		for(int i = remove; i < ar.length -1; i++) {
			ar[i] = ar[i + 1];
		}
		System.out.println("After removing"+remove+" "+Arrays.toString(ar));


	}

}
