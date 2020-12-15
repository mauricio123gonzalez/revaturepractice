package parameters;

public class Parameters1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfNumbers(1,2,3));

	}
	
	public static int sumOfNumbers(int ...a) {
		int sum=0;
		for(int i:a) { // adds each element
			sum=sum+i;
		}
		return sum; //saves it for the function?
	
	}

}
