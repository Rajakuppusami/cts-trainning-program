import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of deliveries");
		int n=sc.nextInt();
		Delivery[] dArr=new Delivery[n];
		for (int i = 0; i < dArr.length; i++) {
			Delivery d=new Delivery();
			System.out.println("Enter the over");
			d.setOver(sc.nextLong());
			System.out.println("Enter the ball");
			d.setBall(sc.nextLong());
			/*System.out.println("Enter the runs");
			d.setRuns(sc.nextLong());
*/			sc.nextLine();
			System.out.println("Enter the batsman name");
			d.setBatsman(sc.nextLine());
			System.out.println("Enter the bowler name");
			d.setBowler(sc.nextLine());
			System.out.println("Enter the nonStriker name");
			d.setNonStriker(sc.nextLine());
			dArr[i]=d;
		}
		DeliveryBO dbo=new DeliveryBO();
		dbo.displayAllDeliveryDetails(dArr);
			/*System.out.println("Over : "+d.getOver()+
				"\nBall : "+d.getBall()+
				"\nRuns : "+d.getRuns()+
				"\nBatsman : "+d.getBatsman()+
				"\nBowler : "+d.getBowler()+
				"\nNonStriker : "+d.getNonStriker());*/
	}

}
