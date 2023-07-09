package harguns4;

import java.util.Scanner;

public class promocode {
	
	public static void main(String[] args) {
		
		int WELCOME50 = 1;
		int ZOMPAYTM = 2;
		int SIMPLPARTY = 3;
		int SBITREATS = 4;
		
		System.out.println("Welcome to Zomato");
		System.out.println("La Pino'z Pizza Promo Codes :-");
		System.out.println("1.WELCOME50");
		System.out.println("2.ZOMPAYTM");
		System.out.println("3.SIMPLPARTY");
		System.out.println("4.SBITREATS");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Amount: ");
		double amount = scanner.nextDouble();
		
		if(amount >=399) {
			System.out.println("Available Promo Codes :-"
					+ "\n1.WELCOME50 "
					+ "\n2.ZOMPAYTM"
					+ "\n3.SIMPLPARTY"
					+ "\n4.SBITREATS");
			System.out.println("Use SBITREATS TO avail Maximum Discount :)");
			
		}else if(amount >=300  && amount<= 399) {
			System.out.println("Available Promo Codes :-"
					+ "\n1.WELCOME50 "
					+ "\n2.ZOMPAYTM"
					+ "\n3.SIMPLPARTY");
			
			System.out.println("Use WELCOME50 TO avail Greatest  Discount ");
		}
		else if(amount >=159 && amount <=200) {
			System.out.println("Available Promo Codes :-"
					+"    "
					+ "\n1.WELCOME50 ");
			System.out.println("");
			System.out.println("Use WELCOME50 TO avail Greatest  Discount ");
		}
		else if (amount <=158) {
			System.out.println("\nNO Promo Codes Avaiable");
			System.out.println("Please Pay \u20b9"+(amount));
			System. exit(0);
		}
		
		System.out.println("Enter Your Desired Promo Code: ");
		int promoCode = scanner.nextInt();
		
		
		

		
		if(promoCode == 1) {
			// Nested if/else
			if(amount >= 159) {
				System.out.println("WELCOME50 Promo Code Applied");
				double discount = 0.50 * amount;
				if(discount >= 100) {
					discount = 100;
				}
				System.out.println("Please Pay \u20b9"+(amount-discount));
			}else {
				System.out.println("Please Pay \u20b9"+(amount));
			}
		}
			
			else if (promoCode == 2) {
			if(amount >= 299) {
				System.out.println("ZOMPAYTM Promo Code Applied");
				double discount = 0.20 * amount;
				if(discount >= 50) {
					discount = 50;
				}
				System.out.println("You will get CashBack of \u20b9 25");
				System.out.println("Please Pay \u20b9"+(amount-discount));
			}else {
				System.out.println("Please Pay \u20b9"+(amount));
			}
				
		}else if (promoCode == 3) {
			if(amount >= 199) {
				System.out.println("SIMPLPARTY Promo Code Applied");
				double discount = 0.40 * amount;
				if(discount >= 95) {
					discount = 95;
				}
				System.out.println("Please Pay \u20b9"+(amount-discount));
			}else {
				System.out.println("Please Pay \u20b9"+(amount));
			}
				
		}
		else if (promoCode == 4) {
			if(amount >= 399) {
				System.out.println("SBITREATS Promo Code Applied");
				double discount = 0.40 * amount;
				if(discount >= 160) {
					discount = 160;
				}
				System.out.println("Please Pay \u20b9"+(amount-discount));
			}else {
				System.out.println("Please Pay \u20b9"+(amount));
			}
				
		}else {
			System.out.println("Invalid Promo Code");
			System.out.println("Please Pay \u20b9"+(amount));
			System.out.println("Use Other Promo Codes to avail Discount :) ");
			
			
		}

			
	
		scanner.close();
		
		
		
		
	}

}
