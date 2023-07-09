package harguns3;

public class problemStatement {

	public static void main(String[] args) {
		int[] partyAVotes = {200,1200,2100,2300,62500};
		int[] partyBVotes = {1200,300,1100,5300,5600,1000,3000};
		
		int partyATotalVotes = 0;
		int partyBTotalVotes = 0;
		
		for(int idx=0;idx<5;idx++) {
			partyATotalVotes = partyATotalVotes + partyAVotes[idx];
		}
		for(int idx=0;idx<7;idx++) {
			partyBTotalVotes = partyBTotalVotes + partyBVotes[idx];
		}
		
		
		System.out.println("PartyATotalVotes: "+partyATotalVotes);
		System.out.println("PartyBTotalVotes: "+partyBTotalVotes);
		
		if(partyATotalVotes > partyBTotalVotes) {
			System.out.println("PARTY A WINS by "+(partyATotalVotes - partyBTotalVotes)+" Votes");
		}else {
			System.out.println("PARTY B WINS by "+(partyBTotalVotes - partyATotalVotes)+" Votes");
		}
		
	}

}
 