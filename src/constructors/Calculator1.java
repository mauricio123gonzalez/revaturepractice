package constructors;

public class Calculator1 {
	
	public Calculator1(String name) {
		System.out.println("hello "+name);
	}
	
	public Calculator1(int x) {
		
	}
	int a;
	int b;
	
	public Calculator1(int x,int y) {
	a=x;
	b=y;
	}
	
	public int add() {
		return a+b;
	}
}
// review last 30 mins of day 2