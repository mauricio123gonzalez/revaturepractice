package strings;

public class Strings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1=10;
		Integer i2=10;
		Integer i3=new Integer(10);
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		System.out.println("i3 = "+i3);
		System.out.println("i1==i2 "+(i1==i2));
		System.out.println("i1==i2 "+(i1==i3));
		
		int x=i1; //autoboxing
		System.out.println("x = "+x);
		x=1000;
		i1=x;
		System.out.println("i1 = "+i1);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		String s="33";
		int age=Integer.parseInt(s);
		System.out.println("age = "+age);
		
		age=99;
		s=age+"";
		System.out.println("s = "+age);
		Integer i5=1000;
		s=i5.toString();
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toOctalString(10));
		
		
		System.out.println("i5 = "+i5);
		//System.out.println("i5.compareTo(1000) "i5.compareTo(1000));

	}

}
