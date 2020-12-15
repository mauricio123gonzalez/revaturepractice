package methods;

public class Methods {
	
	public static void main(String[] args) {
		iAmStatic();
		iAmStatic("Mauricio");
	}

	public static void iAmStatic() {
		System.out.println("hello static");
	}

	
	public static void iAmStatic(String name) {
		System.out.println("hello static ="+name);
	}


}
