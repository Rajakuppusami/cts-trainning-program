import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*Player p=new Player();
		System.out.println("Enter the player name ");
		p.setName(sc.nextLine());
		System.out.println("Enter the country name ");
		p.setCountry(sc.nextLine());
		System.out.println("Enter the skill ");
		p.setSkill(sc.nextLine());
		PlayerBO pbo=new PlayerBO();
		pbo.displayPlayerDetails(p);*/
		
		//System.out.println("Player Details \n"+p);
		System.out.println("Enter the number of players");
		int n=sc.nextInt();
		Player[] pArr=new Player[n];
		for (int i = 0; i < pArr.length; i++) {
			//System.out.println("Enter the player "+(i+1)+" details");
			System.out.println("Enter the player name");
			Player p=new Player();
			p.setName(sc.nextLine());
			System.out.println("Enter the country name");
			p.setCountry(sc.nextLine());
			System.out.println("Enter the skill");
			p.setSkill(sc.nextLine());
			pArr[i]=p;
		}
		PlayerBO pbo=new PlayerBO();
		pbo.displayAllPlayerDetails(pArr);
		System.out.println("Enter the country name for which players details to be known");
		String countryName=sc.nextLine();
		pbo.displaySpecificPlayerDetails(pArr, countryName);
		/*if(pArr[0].equals(pArr[1]))
			System.out.println("Both the player details are same.");
		else
			System.out.println("Both the player details are different.");
	*/
	}

}
