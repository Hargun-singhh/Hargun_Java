package harguns3;

import java.util.Arrays;

public class RefereneCopy {

	public static void main(String[] args) {
		int[] scores = {12,30,50,60,70,80,100,13,15,68};
		// reference copy operation
		int []teamScores = scores;
		System.out.println("scores -"+scores);
		System.out.println("Team scores -"+teamScores);
		
		//update
		teamScores[0] =99;
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(teamScores));

	}

}
