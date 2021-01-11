package lambda.demo;

public class LambdaStyleMain {
public static void main(String[] args) {
	HelloFunctional h1=()->System.out.println("Lambda");
	h1.hello();
	
	HelloFunctional h2=()-> {
		System.out.println("1");
		System.out.println("2");
	};
	h2.hello();
	
	HelloInterfaceFunctionalByName hello=(n)->{
		System.out.println("hello "+n);
	};
	hello.sayHello("Mauricio");
	
	AddFunctional add=(x,y,z)->{
		return x+y+z;
	};
	System.out.println("sum is "+add.sum(123, 2322, 234));
}

}
