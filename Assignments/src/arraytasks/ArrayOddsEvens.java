package arraytasks;

import java.util.Arrays;

public class ArrayOddsEvens {

	public static void main(String[] args) {
			int array1[] = {1,2,3,4,5,6,7,8,9};  
			int even[] = {0,0,0,0,0,0,0,0,0};
			int odd[] = {0,0,0,0,0,0,0,0,0};
			int evensum = 0;
			int oddsum = 0;
			
			System.out.println("even numbers :");
			for(int i=0;i<array1.length;i++) {
				if(array1[i]%2==0) {
					even[i] = array1[i];
					evensum = evensum+i;
					//System.out.println(even[i]);
				}
			}
			
			System.out.println(Arrays.toString(even));
			System.out.println("Sum of evens "+evensum);
			
			System.out.println("odd numbers :");  
			for(int i=0;i<array1.length;i++) {  
				if(array1[i]%2!=0){  
					odd[i] = array1[i];
					oddsum = oddsum+i;
					//System.out.println(odd[i]); 

				}
				
				
			}
			
			System.out.println(Arrays.toString(odd));
			System.out.println("Sum of odds "+oddsum);
			
			if(evensum > oddsum) {
				System.out.println("Even greater than odd");
			}else if(evensum < oddsum) {
				System.out.println("Odd greater than even");
			}

	}

}
//3)Find all the even numbers and put it in a new array and also find all odd numbers and put it in another array
//4)Find the sum of all even and odd numbers separately and print the max out of it.(max of sum of even vs odd)
