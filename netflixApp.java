package netflix;

import java.util.Scanner;

public class netflixApp {

	public static void main(String[] args) {
		
		actor[] starcast1 = {
				new actor("Amir khan",55,"M",35),
				new actor("Akshay kumar",50,"M",20),
				new actor("Madhuri Dixit",40,"F",32)
		};
		
		Movie[] bollywoodmovie = {
				new Movie("Dil","2hrs 30min",4.3,starcast1)
		};
		
		catergory[] catergories = {
				new catergory("Bollywood",1,3,bollywoodmovie)
				
		};
		System.out.println("Welcome To Netflix");
		
		System.out.println("WELCOME TO NETFLIX");
		for(int idx=0; idx<catergories.length; idx++) {
			catergories[idx].showTitle();
		}
		
		System.out.println();
		System.out.println("1: Bollywood, 2: Hollywood, 3: Tollywood");
		System.out.println("Enter Your Choice: ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		if(choice <=3) {
			catergories[choice-1].showmovie();
		}
		

	}

}