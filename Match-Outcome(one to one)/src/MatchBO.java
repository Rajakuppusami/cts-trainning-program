import java.util.ArrayList;
import java.util.List;

public class MatchBO {
	
	public void printAllMatchDetails(List<Match> MatchList){
		System.out.println("Match Details");
		System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s","Date","Team1","Team2","Venue","Status","Winner");
		for (int i = 0; i < MatchList.size(); i++) {
			System.out.println(MatchList.get(i));
		}
	}
	
	public void printMatchDetailsWithOutcomeStatus(List<Match> MatchList, String outcomeStatus){
		List<Match> li=new ArrayList<Match>();
		for (int i = 0; i < MatchList.size(); i++) {
			if(MatchList.get(i).getOutcome().getStatus().equalsIgnoreCase(outcomeStatus)){
				li.add(MatchList.get(i));
			}
		}
		if(li.isEmpty())
			System.out.println("Status not found");
		else{
			System.out.println("Match Details");
			System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s","Date","Team1","Team2","Venue","Status","Winner");
			for (Match match : li) {
				System.out.println(match);
			}
		}
	}
	
	public void printMatchDetailsWithOutcomeWinnerTeam(List<Match> MatchList, String outcomeWinnerTeam){
		List<Match> li=new ArrayList<Match>();
		for (int i = 0; i < MatchList.size(); i++) {
			if(MatchList.get(i).getOutcome().getWinnerTeam().equalsIgnoreCase(outcomeWinnerTeam)){
				li.add(MatchList.get(i));
			}
		}
		if(li.isEmpty())
			System.out.println("Winner Team not found");
		else{
			System.out.println("Match Details");
			System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s","Date","Team1","Team2","Venue","Status","Winner");
			for (Match match : li) {
				System.out.println(match);
			}
		}
	}
	
}
