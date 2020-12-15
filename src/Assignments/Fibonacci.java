package Assignments;

public class Fibonacci {
	 static int f1=0,f2=1,f3=0;    
	 static void printFib(int count){    
	    if(count>0){    
	         f3 = f1 + f2;    
	         f1 = f2;    
	         f2 = f3;    
	         System.out.print(" "+f3);   
	         printFib(count-1);    
	     }    
	 }    
	 public static void main(String args[]){    
	  int count=30;    
	  System.out.print(f1+" "+f2);//printing 0 and 1    
	  printFib(count-2);//n-2 because 2 numbers are already printed   
	 }  
	}  