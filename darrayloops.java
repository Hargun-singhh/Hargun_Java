package netflix;

public class darrayloops {

	public static void main(String[] args) {
		int[][][] darray = {
				{
					{50,20,60,70},
					{10,20,30,40},
					{70,80,90,40}
				}
		};
		System.out.println("USING Enhanced Loops");
		for(int[][]first:darray) {
			for(int[]row : first) {
				for(int num:row) {
					System.out.print(num + " ");
				}
				 System.out.println();
				
			}
			 System.out.println();
		}
		

	}

}
