package harguns4;

import java.util.Scanner;

public class view {

	public static void main(String[] args) {
//		String Name = "Hargun";
//		String Email = "Hargun14.hs@icloud.com";
//		System.out.println(Name+"  HashCode"+Name.hashCode());
//		System.out.println(Email+"  HashCode"+Email.hashCode());
		
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = scanner.nextLine();
		System.out.println("Enter your Email");
		String Email = scanner.nextLine();
		System.out.println("Enter your Age");
		int Age = scanner.nextInt();
		
		System.out.println("Name is: "+name);
		System.out.println("Email is: "+Email);
		System.out.println("Age is: "+Age);
		
		scanner.close();// for more optimization 


		
		

	}

}
