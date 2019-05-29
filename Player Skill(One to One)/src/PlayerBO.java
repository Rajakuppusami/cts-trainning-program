import java.util.ArrayList;
import java.util.List;

class PlayerBO
{

 
  void viewDetails(Player[] playerList)
  { 
     //fill your code
	  for (int i = 0; i < playerList.length; i++) {
		  System.out.println(playerList[i]);
	  }
   }
  void printPlayerDetailsWithSkill(Player[] playerList, String skillName)
  {
    //fill your code
	  List<Player> li=new ArrayList<Player>();
	  for (int i = 0; i < playerList.length; i++) {
		  if(playerList[i].getSkill().getSkillName().equals(skillName)){
			  li.add(playerList[i]);
		  }
	  }
	  if(li.isEmpty()){
		  System.out.println("Skill not found");
	  }else{
		  for (Player player : li) {
			System.out.println(player);
		}
	  }
  }

}
