package constructors;

public class Constructor1 { //you can only have one public class per file
// you cannot create a static/protected/private OUTER classes, you can do this with innter classes
	public void outerMethod() {
		// TODO Auto-generated method stub
		InnerPrivate i=new InnerPrivate();
		i.helloInnerPrivate();

	}
	
	private class InnerPrivate {
		public void helloInnerPrivate() {
			System.out.println("private");
		}
	}
	
	
	public class InnerPublic{
		public void helloInnerPublic() {
			System.out.println("public");
		}
	}
	
	public static class InnerPublicStatic {
		public void helloInnerPublicNonStatic() {
			System.out.println("publicinnernonstatic");
	}
		public static void helloInnerPublicStatic() {
			System.out.println("publicinnerstatic");
}
}}//review this!
//if it is non static inner class, it can only have non static methods!
//and you need to create the object of the outer class to access the inner class and its methods
//static can have static and non static methods, you do not need an object to access static
//to access non static methods of a static inner class you need object of only static 
//inner class not of the outer class