import java.util.ArrayList;

public class RequalifyVote extends Vote{
	public void requalifyVote(int idNumber){
		//Same thing as disqualify vote but in reverse
		if(Vote.arrayList.contains(idNumber)){
			Vote.arrayList.add(idNumber);
			DisqualifyVote.disqualifiedVoteList.remove(idNumber);
		}
		else{
			throw new Exception("ID Number Not Found.");
		}
	}
}
