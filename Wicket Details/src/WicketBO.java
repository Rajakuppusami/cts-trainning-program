
public class WicketBO {
	public void displayAllWicketDetails(Wicket[] wicketList){
		System.out.println("Wicket Details");
		
		for (int i = 0; i < wicketList.length; i++) {
			System.out.println("Wicket "+(i+1));
			System.out.println(wicketList[i]);
		}
	}
	public void displaySpecificWicketDetails(Wicket[] wicketList, String wicketType){
		for (int i = 0; i < wicketList.length; i++) {
			if(wicketList[i].getWicketType().equals(wicketType)){
				System.out.println("Wicket "+(i+1));
				System.out.println(wicketList[i]);
			}
		}
	}
}
