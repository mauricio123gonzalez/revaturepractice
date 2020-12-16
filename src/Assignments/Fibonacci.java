package Assignments;
//Create a class with method which generates fibonacci sequence
public class Fibonacci {
	 static int f1=0,f2=1,f3=0;    
	 static void printFib(int seq){    
	    if(seq>0){    
	         f3 = f1 + f2;    
	         f1 = f2;    
	         f2 = f3;    
	         System.out.print(" "+f3);   
	         printFib(seq-1);    
	     }    
	 }    
	 public static void main(String args[]){    // testing
	  int seq=30; //how long we want the sequence to go
	  System.out.print(f1+" "+f2);//printing 0 and 1 that get deleted at the start  
	  printFib(seq);//getting rid of last 2 in sequence to make room for 0 and 1   
	 }  
	}  