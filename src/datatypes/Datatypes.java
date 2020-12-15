package datatypes;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*8 primitive data types
		 * datatype              size(bytes)         defaultValue
		 * ---------------------------------------------------------
		 * byte                 	1						0
		 * short					2						0
		 * int						4						0
		 * long						8						0 any long variable ends with L
		 * 
		 * float					4						0.0000f any float variable ends with f
		 * double					8						0.0000d java takes all decimal values as double by default
		 * 
		 * char						2						'\u00000' java supports unicode
		 * 
		 * boolean					1bit					false
		 */
		
		int x=10; // variables get allocated in the default value
		System.out.println("x = "+x);
		
		float f=123.55f;
		System.out.println("f = "+f);
		
		long contact=12345L;
		System.out.println("contact :   "+contact);
		
		String s1="Mauricio"; // objects get allocated to an address
		System.out.println("s1 : "+s1);
		
		double d=23.1234;
		System.out.println("d = "+d);
		
		char c='M';
		System.out.println("c = "+c);
		
		boolean s=x>=10;
		System.out.println("s is "+s);
	}

}
// learn about arithmetic and relational operators right now