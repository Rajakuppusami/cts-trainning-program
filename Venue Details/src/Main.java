import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter the number of venues");
		int n=sc.nextInt();
		sc.nextLine();
		Venue[] vArr =new Venue[n];
		for (int i = 0; i < vArr.length; i++) {
			System.out.println("Enter the details of venue "+(i+1));
			String str = sc.nextLine();
			String[] strArr=str.split(",");
			Venue v=new Venue(strArr[0], strArr[1]);
			vArr[i]=v;
		}
		System.out.println(Venue.class.getClass().getName());
		for (int i = 0; i < vArr.length; i++) {
			System.out.println("Venue Name : "+vArr[i].getName()+"\nCity Name : "+vArr[i].getCity());
		}*/
		Venue v=new Venue();
		System.out.println("Enter the venue name");
		v.setName(sc.nextLine());
		System.out.println("Enter the city name");
		v.setCity(sc.nextLine());
		//System.out.println(v.getClass().getName()+" Details\n"+v);
		VenueBO vbo=new VenueBO();
		vbo.displayVenueDetails(v);
	}

}
