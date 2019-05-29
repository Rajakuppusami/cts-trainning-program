import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> li=new ArrayList<String>();
		int n=sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			li.add(sc.nextLine());
		}
		String search = sc.nextLine();
		int count=0;
		for (String string : li) {
			if(string.equals(search)){
				count++;
			}
		}
		System.out.println(count);
	}

}
