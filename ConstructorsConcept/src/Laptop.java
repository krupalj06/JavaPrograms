
public class Laptop {
	
	String brand; 
	double price;
	String color;
	
	//Constructor overloading 
	Laptop(){ // 0 arg cons  // default cons
		System.out.println("This is constructor");
		//initializing ur instance variable
	}
	
	Laptop(String inbrand , double inPrice, String inColor){
		brand = inbrand;
		price = inPrice;
		color = inColor;
	}
	
	Laptop(String inbrand , double inPrice){
		brand = inbrand;
		price = inPrice;
	}
	
	void playGames() {
		System.out.println("Playing game");
	}

	void programming() {
		System.out.println("Programming");
	}
}
