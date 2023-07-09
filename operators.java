package harguns4;

public class operators {

	public static void main(String[] args) {
	// Arithmetic Operators
		
		double amount = 125.25;
		double taxes = 0.18;
		int deliveryFee = 25;
		double amountToPay = amount + (amount*taxes)+deliveryFee;
		System.out.println("Amount to be paid: "+amountToPay);
		
		double num1 =13;
		double result = num1 / 3;
		System.out.println("Result is: "+result);
		
		int result1 = -13 >> 3;
		System.out.println(result1);
		
		/*
		 13 - 1101
		 	  0010
		 	     1
		 	  0011
		 	  >> 3
		 	  _ _ _ 0
		 	  1 1 1 0
		 	  0 0 0 1
		 	        1
		 	  0 0 1 0  --- Result
		 	  
		 */
		
		int data = 12;
		int secretCode = 2;
		
		int dataToSend = data >> secretCode;
		System.out.println("dataToSend is: "+dataToSend);
		int dataToReceive = dataToSend << secretCode;
		System.out.println("dataToReceive is: "+dataToReceive);
		
		

	}

}
 