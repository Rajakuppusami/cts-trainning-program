
public class PlayerBO {
	public void displayAllPlayerDetails(Player[] playerList){
		System.out.println("Player Details");
		for (int i = 0; i < playerList.length; i++) {
			System.out.println(playerList[i]);
		}
		
	}
	public void displaySpecificPlayerDetails(Player[] playerList, String countryName){
		System.out.println("Player Details");
		for (int i = 0; i < playerList.length; i++) {
			if(playerList[i].getCountry().equals(countryName))
			{
				System.out.println(playerList[i]);
			}
		}
	}
}
