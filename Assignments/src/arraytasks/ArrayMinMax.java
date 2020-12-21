package arraytasks;

public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int ar[]= {12,33,11,2,344,11,12,11,22,11,11,23,11,44,11,22,11};
		int x = 0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] > x) {
				x = ar[i];
			}
			
			
			
		}
		System.out.println("Max = "+x);
		int y = 100000;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] < y) {
				y = ar[i];
			}

		//int y = 0;
		//for(int i=0;i<ar.length;i++) {
		//	if(i==0) {
		//		y=ar[i];
		//	}else if(ar[i]<y) {
		//		y = ar[i];
		//	}

		}
		System.out.println("Min = "+y);
	}
}
//5)Find the minimum and the maximum element in an array