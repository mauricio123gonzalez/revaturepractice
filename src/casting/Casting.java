package casting;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * casting/typecasting refers to data type conversion
		 * 2 ypes
		 * Implicit casting - taken care by java complier implicitly when the smaller data type is assigned to the larger data type
		 * Explicit casting - used to convert larger data type to smaller
		 */
		int x=100;
		float m=x; //implicit casting
		System.out.println("x ="+x);
		System.out.println("m = "+m);
		
		m=89.95f;
		System.out.println("m = "+m);
		double d=m; //also implicit casting, dont forget that double that its limited to 64bit
		System.out.println("d = "+d);
		
		char c='Y'; //ASCI representation of y is 89, more implicit
		int q=c;
		System.out.println("q = "+q);
		q++; // q + 1
		c=(char)q; //explicit, char is smaller than int
		System.out.println("c = "+c); // z is 90
		
		System.out.println("m = "+m);
		x=(int)m; //explicit, it is truncating (getting rid of decimal because its less precise datatype)
		System.out.println("x = "+x);
	}

}
