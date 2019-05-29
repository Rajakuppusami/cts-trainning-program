class TeamBO
{

  
 public Team createTeam(String data, Player[] playerList)
 {
  
    //fill your code
	 String[] values=data.split(",");
	 Team team =null;
	 for (int i = 0; i < playerList.length; i++) {
		if(playerList[i].getName().equals(values[1])){
			team=new Team(values[0], playerList[i]);
			break;
		}
	 }
	 return team;
 }
 


}
