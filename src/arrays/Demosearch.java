package arrays;
//Linear search
public class Demosearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2,3,4,5,6,7,8,9};
		boolean b=false;
		int searchElement=22;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]==searchElement) {
				b=true;
				//break;
		}

	}
	if(b) {
		System.out.println(searchElement+" found");
	}
	else {
		System.out.println(searchElement+" not found");
	}

		
}}
