
public class LaptopTester {
	public static void main(String[] args) {
		System.out.println("prog started");
		
		System.out.println("Dell laptop details");
		Laptop dell = new Laptop(); //instance
		dell.brand = "Dell";
		dell.color = "Black";
		dell.price = 20000;
		
		System.out.println("brand: "+ dell.brand );
		System.out.println("price: "+ dell.price );
		System.out.println("color: "+ dell.color );
		
		System.out.println("Lenovo laptop details");
		Laptop lenovo = new Laptop("Lenovo", 20000.00 , "Brown");
		
		System.out.println("brand: "+ lenovo.brand );
		System.out.println("price: "+ lenovo.price );
		System.out.println("color: "+ lenovo.color );
		
		
		System.out.println("HP laptop details");
		Laptop hp = new Laptop("HP", 15000.00);
		hp.color = "black";
		
		System.out.println("brand: "+ hp.brand );
		System.out.println("price: "+ hp.price );
		System.out.println("color: "+ hp.color );
		hp.playGames();
		
		System.out.println("End prog");
	}

}
