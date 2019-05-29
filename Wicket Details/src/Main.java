import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of wickets");
		int n=sc.nextInt();
		Wicket[] wArr=new Wicket[n];
		sc.nextLine();
		for (int i = 0; i < wArr.length; i++) {
			System.out.println("Enter the details of wicket "+(i+1));
			String str=sc.nextLine();
			String[] strArr=str.split(",");
			Wicket w=new Wicket(Long.parseLong(strArr[0]),Long.parseLong(strArr[1]),strArr[2],strArr[3],strArr[4]);
			wArr[i]=w;
		}
		//System.out.println("Wicket Details");
		/*for (int i = 0; i < wArr.length; i++) {
			System.out.println("Over : "+wArr[i].getOver()+
				"\nBall : "+wArr[i].getBall()+
				"\nWicket Type : "+wArr[i].getWicketType()+
				"\nPlayer Name : "+wArr[i].getPlayerName()+
				"\nBowler Name : "+wArr[i].getBowlerName());
		}*/
		WicketBO wbo =new WicketBO();
		wbo.displayAllWicketDetails(wArr);
		System.out.println("Enter the wicket type to be searched");
		String wicketType=sc.nextLine();
		wbo.displaySpecificWicketDetails(wArr, wicketType);
	}

}
