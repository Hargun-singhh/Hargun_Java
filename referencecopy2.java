package harguns3;

import java.util.Arrays;

public class referencecopy2 {

	public static void main(String[] args) {
		int[] scores = {12,30,50,60,70,80,100,13,15,68};
		int[] rollNumber = {1,2,3,4,5};
		// reference copy operation
		int []teamScores = scores;
		teamScores = rollNumber;
		teamScores[1] =99;
		
		System.out.println("rollNumber -"+rollNumber);
		System.out.println("Team scores -"+teamScores);
		
		System.out.println("scores:"+Arrays.toString(scores));
		System.out.println("teamScores:"+Arrays.toString(teamScores));
		System.out.println("rollNumber:"+Arrays.toString(rollNumber));

		

		
	}

}
