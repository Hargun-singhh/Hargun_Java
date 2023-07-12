package harguns7;

class Dish{
	String name;
	int price;
	double ratings;
	
	Dish(){
		name="NA";
		price =0;
		ratings = 0.3;
		
	}
	
	Dish(String n , int p ,double r){
		this.name=n;
		this.price = p;
		this.ratings= r;
		
	}
	
	void update(String n , int p ,double r) {
		this.name=n;
		this.price = p;
		this.ratings= r;
		
		
	}
	
	void show() {
		System.out.println("~~~~~~~~~~~~~~~~~");
		System.out.println("Name: "+name);
		System.out.println("Price: \u20b9"+price);
		System.out.println("Ratings: "+ratings);
		
		System.out.println("~~~~~~~~~~~~~~~~~");
	}
	
}

public class OOPSAgain {

	public static void main(String[] args) {
		Dish dish1 = new Dish();
		Dish dish2 = new Dish("Pizza",300,4.0);
		Dish dish3 = new Dish("Masala Dosa",120,4.7);
		
		System.out.println("Dish1 is: "+dish1);
		System.out.println("Dish2 is: "+dish2);
		
		dish1.update("Noodles", 450, 4);
		
		
		dish1.show();
		dish2.show();
		dish3.show();

		

	}

}
