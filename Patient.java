package harguns10;

public class Patient {
	String name;
	int age;
	char gender;
	Patient next;
	Patient previous;

	
	Patient(){
		
		
	}
	Patient(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	void show() {
		System.out.println("~~~~~~~~~~~~~~~~~");
		System.out.println("Name: "+name);
		System.out.println("Age- "+age);
		System.out.println("Gender: "+gender);
		System.out.println("~~~~~~~~~~~~~~~~~");
	}
	

}
