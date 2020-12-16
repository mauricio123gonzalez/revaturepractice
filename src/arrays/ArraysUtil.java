package arrays;

import java.util.Arrays;

public class ArraysUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,11,3,12,5,13,7,8,9};
		System.out.println("contents ");
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println("After sort");
		System.out.println(Arrays.toString(ar));
		
		int ar1[]=Arrays.copyOf(ar, ar.length+10);
		System.out.println("ar1 = "+Arrays.toString(ar1));
		
		int ar2[]=new int[10];
		Arrays.fill(ar2, 9999);
		System.out.println("ar2 = "+ Arrays.toString(ar2));
		
		//Binary Search - a searching algorithm that uses a "divide and conquer" approach.
		// Prerequisite to perform is that the array should be in ascending order
		//1) Starts search from middle position of array, 
		//if middle element is matching to the search element it will return true
		//2) If middle element is greater than search, it goes to greater side
		//else lower
		//it keeps going to the middle of each section, it does not go 1 by 1
		System.out.println(Arrays.binarySearch(ar, 100));
		System.out.println(Arrays.binarySearch(ar, 11));
		
		
	}

}
