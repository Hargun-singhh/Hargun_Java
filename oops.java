package harguns7;

class Restuarant {
	
	String name;
	String phoneNO;
	String email;
	String operationHours;
	String address;
	double ratings;
	int pricePerPerson;
	
	
}

public class oops {
	

	public static void main(String[] args) {
		
		Restuarant restuarant1 = new Restuarant();
		Restuarant restuarant2 = new Restuarant();

		
//		System.out.println("restuarant is: "+restuarant1);
		
		
		restuarant1.name = "Table by Basant";
		restuarant1.phoneNO = "+91 6280868983";
		restuarant1.email = "Tablebasant@gamil.com";
		restuarant1.operationHours = "7:00 am to 11:00 pm";
		restuarant1.address = "FGM ,Ludhiana";
		restuarant1.ratings = 4.5;
		restuarant1.pricePerPerson = 200;
		
		
		restuarant2.name = " Basant";
		restuarant2.phoneNO = "+91 9779081707";
		restuarant2.email = "basant@gamil.com";
		restuarant2.operationHours = "8:00 am to 11:00 pm";
		restuarant2.address = "Fountain chonwk near Mall Road, Ludhiana";
		restuarant2.ratings = 4.7;
		restuarant2.pricePerPerson = 350;
		
		
		// Read operation 
		
		System.out.println("Restuarant1 Details:");
		System.out.println("Name: "+restuarant1.name+"\nPhoneNo: "+restuarant1.phoneNO+"\nPer Person Price: "+restuarant1.pricePerPerson);
		System.out.println("           ");
		System.out.println("Restuarant2 Details:");
		System.out.println("Name: "+restuarant2.name+"\nPhoneNo: "+restuarant2.phoneNO+"\nPer Person Price: "+restuarant2.pricePerPerson);

		
		
		

	}

}
