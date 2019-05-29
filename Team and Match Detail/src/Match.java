class Match
{
  String  date;
  String teamone;
  String teamtwo;
  String venue;
  Team team;

  Match(){}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}


public String getTeamone() {
	return teamone;
}

public void setTeamone(String teamone) {
	this.teamone = teamone;
}

public String getTeamtwo() {
	return teamtwo;
}

public void setTeamtwo(String teamtwo) {
	this.teamtwo = teamtwo;
}

public String getVenue() {
	return venue;
}

public void setVenue(String venue) {
	this.venue = venue;
}

public Team getTeam() {
	return team;
}

public void setTeam(Team team) {
	this.team = team;
}

public Match(String date, String teamone, String teamtwo, String venue, Team team) {
	super();
	this.date = date;
	this.teamone = teamone;
	this.teamtwo = teamtwo;
	this.venue = venue;
	this.team = team;
}

@Override
public String toString() {
	return String.format("%-15s %-15s %-15s %s",this.date,this.teamone,this.teamtwo,this.venue);
}
 


}

