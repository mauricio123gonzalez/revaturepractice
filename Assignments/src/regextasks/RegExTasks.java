package regextasks;

public class RegExTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss="123-45-6789";
		if (ss.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
			System.out.println("valid SS");
		}else {
			System.out.println("invalid SS");
		}
		String dl="12345678";
		if (dl.matches("[0-9]{8}")) {
			System.out.println("valid DL");
		}else {
			System.out.println("invalid DL");
		}
		

	}

}
