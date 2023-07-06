package harguns3;

import java.util.Arrays;

public class MVC {
	
	public static void main(String[] args) {
		
		int price = 200;
		
		// Reference type
		// prices is reference variable
		// stored in heap and constant  pool also
		//Array         0    1    2  3   4 
		int[] prices = {200,300,400,500,1200};
		System.out.println("Prices - "+prices);		
		System.out.println("Hashcode - "+prices.hashCode());
		System.out.println(Arrays.toString(prices));
		
		
	}

}
