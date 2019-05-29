  public class PlayerBO {
    public Player createPlayer(String data, Team[] teamList)
	{
		//fill your code;
         String[] values = data.split(",");
         Team team = null;
         Player player= null;
         for (int i = 0; i < teamList.length; i++) {
			if(teamList[i].getName().equalsIgnoreCase(values[1])){
				player = new Player(values[0], teamList[i]);
			}
		}
        return player;
	}
	
	public String findTeamName(Player[] playerList, String playername)
	{
		 //fill your code;
		String result=null;
		for (int i = 0; i < playerList.length; i++) {
			if(playerList[i].getName().equals(playername)){
				result=playerList[i].getTeam().getName();
			}
		}
		return result;
	}
	
	public Boolean findWhetherPlayersAreInSameTeam (Player[] playerList, String playername1, String playername2)
	{
		//fill your code;
		Team team1=null;
		Team team2=null;
		boolean result=false;
		for (int i = 0; i < playerList.length; i++) {
			if(playerList[i].getName().equals(playername1)){
				team1=playerList[i].getTeam();
			}
			if(playerList[i].getName().equals(playername2)){
				team2=playerList[i].getTeam();
			}
		}
		
		if(team1.equals(team2)){
			result=true;
		}
		return result;
	}

}




