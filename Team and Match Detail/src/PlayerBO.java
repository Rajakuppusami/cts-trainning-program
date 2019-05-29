class PlayerBO
{

  public Player createPlayer(String data)
   {
     //fill your code;
	  String[] values= data.split(",");
	  Player player=new Player(values[0], values[1], values[2]);
	  return player;
   }

}
