import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Integer n=sc.nextInt();
		List<Integer> li=new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			li.add(sc.nextInt());
		}
		double average = 0;
		for (Integer integer : li) {
			average +=integer;
		}
		System.out.println((int)average);
		System.out.println((Double)((average)/li.size()));
	}

}
