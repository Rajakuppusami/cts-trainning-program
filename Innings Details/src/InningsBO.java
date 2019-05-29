
public class InningsBO {
	public void displayAllInningsDetails(Innings[] inningsList){
		System.out.println("Innings Details");
		/*for (int i = 0; i < inningsList.length; i++) {
			System.out.println("Innings "+(i+1)+"\n"+inningsList[i]);
		}*/
		for (int i = 0; i < inningsList.length; i++) {
			System.out.println(inningsList[i]);
		}
	}
}
