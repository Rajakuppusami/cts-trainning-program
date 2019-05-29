package Session2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> li=new ArrayList<Integer>();
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			li.add(sc.nextInt());
		}
		 int result =0;
		 for(int i=1;i<li.size();i+=2){
			 result+=li.get(i);
		 }
		 System.out.println(result);
	}

}
