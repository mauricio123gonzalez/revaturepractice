package encapsulation;

public class Product {

		private int id;
		private String name;
		private double price;
		
		public Product() {
			
		}
		
		public Product(int id, String name, double price) {
			this.id = id;
			this.name = name;
			this.price = price;
		}
		
		public void printProduct() {
			System.out.println(id);
			System.out.println(name);
			System.out.println(price);
		}
		
		public void setID(int id) {
			this.id = id;
		}
		

	}


