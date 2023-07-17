package netflix;

public class actor {
	String name;
	int experience;
	String gender;
	int age;
	
	
	
	
	actor(String name, int experience,  String gender,int age) {
		super();
		this.name = name;
		this.experience = experience;
		this.gender = gender;
		this.age = age;
	}
	
	void show() {
		System.out.println("~~~~~Actor~~~~~~");
		System.out.println("Name:"+name);
		System.out.println("experience:"+experience);
		System.out.println("gender:"+gender);
		System.out.println("age:"+age);
		
	}
	
	

}
