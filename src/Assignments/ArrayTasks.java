package Assignments;

import java.util.Arrays;

public class ArrayTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TASK 1
		 int[] array = {1,2,3,4,5,6,7,8,9};
		  System.out.println("The array : "+Arrays.toString(array));  
		   for(int i = 0; i < array.length / 2; i++)
		  {
		    int c = array[i];
		    array[i] = array[array.length - i - 1];
		    array[array.length - i - 1] = c;
		  }
		    System.out.println("The array in reverse : "+Arrays.toString(array));
		    
		    //TASK 3
			int array1[] = {1,2,3,4,5,6,7,8,9};  
			int even[] = {0,0,0,0,0,0,0,0,0};
			int odd[] = {0,0,0,0,0,0,0,0,0};
			int evensum = 0;
			int oddsum = 0;
			
			System.out.println("even numbers :");
			for(int i=0;i<array1.length;i++) {
				if(array[i]%2==0) {
					even[i] = array1[i];
					evensum = evensum+i;
					//System.out.println(even[i]);
				}
			}
			
			System.out.println(Arrays.toString(even));
			System.out.println(evensum);
			
			System.out.println("odd numbers :");  
			for(int i=0;i<array1.length;i++) {  
				if(array1[i]%2!=0){  
					odd[i] = array1[i];
					oddsum = oddsum+i;
					//System.out.println(odd[i]); 

				}
				
			}
			
			System.out.println(Arrays.toString(odd));
			System.out.println(oddsum);
	}

}
//Tasks
//Print array in reverse
//Delete specific element from array (as in delete a number, not a position)
//Find all even numbers and put it in a new array, also find all odd numbers and put them in another array
//Find sum of all even and odd numbers separately, and print the max out of it(even vs odd)
//Find the min and max element in an array
//Find all palindromes in an array