package stringbuilderbuffer;

public class BufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer("hello"); //anything in "" is string object, buffer created is another object, there are 2 objects
		System.out.println(sb1);
		sb1.append("hey").append(123).append(456.7).append('c');
		System.out.println(sb1);
		
		sb1.insert(1, "JAVA");
		System.out.println(sb1);
		sb1.delete(1, 5);
		System.out.println(sb1);
		
		sb1.deleteCharAt(1);
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		System.out.println(sb1.length());
		
		StringBuffer sb2=new StringBuffer("java");
		StringBuffer sb3=new StringBuffer("java");
		
		System.out.println(sb2.equals(sb3)); //equals doesnt work here, not available for buffer/builder classes
		//equals will be the same as == in this scenario
		System.out.println(sb2.toString().equals(sb3.toString())); //convert to string
	}

}
