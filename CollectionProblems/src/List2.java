import java.util.ArrayList;
import java.util.Collections;
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
		Collections.sort(li);
		for (Integer integer : li) {
			System.out.println(integer);
		}
	}

}
