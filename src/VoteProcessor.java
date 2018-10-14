import java.util.ArrayList;

public class VoteProcessor {
	public static void main(String[] args) {
		
	}
	
	public String calculateElectionWinner(ArrayList<String> votes) {
		String winner = "";
		int pope = 0;
		int snow = 0;
		for (int i = 0; i < votes.size(); i++) {
			if (votes.get(i).equalsIgnoreCase("pope francis")) {
				pope ++;
			} if (votes.get(i).equalsIgnoreCase("edward snowden")) {
				snow ++;
			}
		} if (snow > pope) {
			winner = "edward snowden";
		} else if (pope > snow){
			winner = "pope francis";
		} else if (pope == snow) {
			winner = "TIE";
		}
		return winner;
	}
	
}
