import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Match m=new Match();
		System.out.println("Enter the match date");
		m.setDate(sc.nextLine());
		System.out.println("Enter the team one");
		m.setTeamOne(sc.nextLine());
		System.out.println("Enter the team two");
		m.setTeamTwo(sc.nextLine());
		System.out.println("Enter the Venue");
		m.setVenue(sc.nextLine());
		System.out.println("Match Details\n"+m);
	}
	
}
