import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the team details");
		String details=sc.nextLine();
		String[] teamDetails=details.split("#");
		Team t=new Team(teamDetails[0],teamDetails[1],teamDetails[2],teamDetails[3],teamDetails[4]);
		System.out.println("Team : "+t.getName()+
"\nCoach : "+t.getCoach()+
"\nLocation : "+t.getLocation()+
"\nPlayers : "+t.getPlayers()+
"\nCaptain : "+t.getCaptain());
	}

}
