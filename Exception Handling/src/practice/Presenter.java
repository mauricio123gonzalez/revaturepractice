package practice;

import java.io.FileNotFoundException;

public class Presenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Business b=new Business();
		String fileName="hello.txt";
		
		try {	
			b.openFile(fileName);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
