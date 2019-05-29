import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class MatchBO
{
   
 public Match createMatch(String data, Team[] teamList)
  {
 
    //fill your code
	 String[] values = data.split(",");
	 Match match = new Match();
	 match.setDate(values[0]);
	 match.setVenue(values[3]);
	 for (int i = 0; i < teamList.length; i++) {
		if(teamList[i].getName().equals(values[1])){
			match.setTeamone(values[1]);
		}
		if(teamList[i].getName().equals(values[2])){
			match.setTeamtwo(values[2]);
		}
	}
	 
	 Team team = new Team();
	 team.setName(values[1]+","+values[2]);
	 match.setTeam(team);
	 return match;
  }

  public Match findTeam(String matchDate, Match[] matchList)
  {
    //fill your code
	  Match match = null;
	  for (int i = 0; i < matchList.length; i++) {
		if(matchList[i].getDate().equals(matchDate)){
			match=matchList[i];
		}
	  }
	  return match;
  }

  public void findAllMatchesInGivenTeam(String teamName, Match[] matchList)
  {
    //fill your code
	  for (int i = 0; i < matchList.length; i++) {
		if(matchList[i].getTeamone().equals(teamName)||matchList[i].getTeamtwo().equals(teamName)){
			System.out.println(matchList);
		}
	}
  }


  
}
