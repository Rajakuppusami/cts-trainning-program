package Session2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<String> li=new ArrayList<String>();
		int n=sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			li.add(sc.nextLine());
		}
		while(true){
			System.out.println("Menu");
			System.out.println("1.Insert Players");
			System.out.println("2.Delete Players");
			int choice=sc.nextInt();
			sc.nextLine();
			String value=sc.nextLine();
			if(choice==1){
				li.add(value);
			}else if(choice==2){
				li.remove(value);
			}
			for (String string : li) {
				System.out.println(string);
			}
			System.out.println("Do you want to continue");
			String conti = sc.nextLine();
			if(conti.equalsIgnoreCase("no")){
				break;
			}
		}
	}

}
