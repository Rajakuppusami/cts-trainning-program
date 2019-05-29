  public class TeamBO {
    public  Team createTeam(String data)
	{
		//fill your code;
    	String[] value = data.split(",");
    	Team team =new Team(value[0], value[1]);
    	return team;
	}
	

}


