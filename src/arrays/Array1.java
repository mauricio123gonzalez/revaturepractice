package arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empid1=100;
		int empid2=101;
		int empid3=103;
		//very inefficient to define every single employee! we will use arrays
		//arrays have a fixed size
		//hold data in a contiguous memory location (each index uses 4 bytes?)
		//only the same data type
		// CRUD (basic data structure operations)
		//Creation
		//Read
		//Update
		//Delete
		int ar[]= {1,2,3,4,5,6,7,8,9};
		int size=ar.length; 
		System.out.println(size+"");
		System.out.println(ar[0]+"");
		for (int i=0; i<ar.length; i++) { //loop through the array
			System.out.println("ar["+i+"] ->" +ar[i]);
		}
		System.out.println("\n\nar[0] - "+ar[0]);
		
		System.out.println("Size of array = "+ar.length);
		
		int ar1[]=new int[10];
		System.out.println("Contents of ar1");
		for(int x:ar1) {
			System.out.println(x+" ");
		}
		System.out.println();
		ar1[0]=22;
		ar1[1]=21;
		ar1[2]=32;
		ar1[3]=43;
		ar1[4]=54;
		int n=5;
		System.out.println("contents of ar1 before insertion");
		for (int i = 0; i < n; i++) {
			System.out.println(ar1[i]+" ");
		}
		System.out.println(); //we are inserting 999 into pos 2
		int pos=2;
		int ele=999;
		for(int i=n;i>=pos;i--) {
			ar1[i]=ar1[i-1];
		}
		ar1[pos-1]=ele; //making sure its actually at the 2nd spot
		n++;
		System.out.println("contents of ar1 after insertion");
		for (int i = 0; i < n; i++) {
			System.out.println(ar1[i]+" ");

	}
		int delpos=4;
		for (int i = delpos-1; i < n; i++) {
			ar1[i]=ar1[i+1];
			
		}
		System.out.println("\nAfter deletion");
		for (int i = 0; i < n; i++) {
			System.out.println(ar1[i]+" ");
		} // something is messing up in this block, review profs code

}}
