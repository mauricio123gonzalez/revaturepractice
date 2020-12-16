package constructors;

public class OuterInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor1 o=new Constructor1();
		o.outerMethod();
		
		Constructor1.InnerPublic i=o.new InnerPublic();
		i.helloInnerPublic();
		


	}

}
