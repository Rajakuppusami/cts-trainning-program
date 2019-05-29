import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter the number of innings");
		int n=sc.nextInt();
		Innings[] inn =new Innings[n];
		sc.nextLine();
		for (int i = 0; i < inn.length; i++) {
			Innings ii=new Innings();
			System.out.println("Enter the values for Innings "+(i+1));
			System.out.println("Enter the BattingTeam");
			ii.setBattingTeam(sc.nextLine());
			System.out.println("Enter the runs scored");
			ii.setRuns(sc.nextLong());
			if(i!=inn.length-1)
				sc.nextLine();
			inn[i]=ii;
		}
		System.out.println("Innings Details");
		for (int i = 0; i < inn.length; i++) {
			System.out.println("Innings "+(i+1)+"\n"+inn[i]);
		}*/
		int n=2;
		Innings[] inn =new Innings[n];
		//sc.nextLine();
		for (int i = 0; i < inn.length; i++) {
			Innings ii=new Innings();
			String title="";
			if(i==0){
				title="FirstInnings";
			}else if(i==1){
				title="SecondInnings";
			}
			System.out.println("Enter the values for "+title);
			System.out.println("Enter the BattingTeam");
			ii.setBattingTeam(sc.nextLine());
			System.out.println("Enter the runs scored");
			ii.setRuns(sc.nextLong());
			if(i!=inn.length-1)
				sc.nextLine();
			inn[i]=ii;
		}
		InningsBO ibo = new InningsBO();
		ibo.displayAllInningsDetails(inn);
		
	}

}
