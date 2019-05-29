
public class Innings {
	private String battingTeam;
	private Long runs;
	public String getBattingTeam() {
		return battingTeam;
	}
	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}
	public Long getRuns() {
		return runs;
	}
	public void setRuns(Long runs) {
		this.runs = runs;
	}
	public Innings(String battingTeam, Long runs) {
		super();
		this.battingTeam = battingTeam;
		this.runs = runs;
	}
	public Innings() {
		super();
	}
	/*@Override
	public String toString() {
		return battingTeam + " -- " + runs;
	}*/
	@Override
	public String toString() {
		return String.format("%-20s %-20s",battingTeam,runs);
	}
	
}
