import java.util.ArrayList;

public class Vote{//extends createElection
	
	public class submission{
		int sIDs;
		ArrayList candidates = new ArrayList();
	}
	
	int studentId;
	String name;
	ArrayList voters = new ArrayList();
	
	public void displayCandidates(){
		//pop up GUI window
	}
	
	public void castVote(int sID, int[] candidate){
		submission voter = new submission();
		voter.sIDs = sID;
		
		for(int i =0; i< candidate.length; i++){
			voter.candidates.add(candidate[i]);
		}
		
		voters.add(voter);
	}
		
	public static void main(){
		/*for( # of candidates)
		 * call candidate list from createElection		
		*/
		//cast vote
	}
}