import java.util.ArrayList;

public class DisqualifyVote extends Vote {
	static ArrayList disqualifiedVoteList = new ArrayList<Vote>();

	//Each vote in the arraylist should be the ID number of the voter
	//There is a scanner that asks for the idnumber to disqualify
	//This method should be called to then remove the ID number of the vote specified
	public void disqualifyVote(int idNumber){
		
		if(Vote.arrayList.contains(idNumber)){
			disqualifiedVoteList.add(idNumber);
			Vote.arrayList.remove(idNumber);
		}
		else{
			throw new Exception("ID Number Not Found.");
		}
	}
}
