package boj;
import java.util.*;

public class BOJ15080 { // Every Second Counts

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" : "); 
		String[] arr2 = sc.nextLine().split(" : "); 
		
		int t1 = Integer.parseInt(arr[0]) * 3600 + Integer.parseInt(arr[1]) * 60 + Integer.parseInt(arr[2]); // the start time
		int t2 = Integer.parseInt(arr2[0]) * 3600 + Integer.parseInt(arr2[1]) * 60 + Integer.parseInt(arr2[2]); // the end time
		
		if (t1 > t2) {
			System.out.println(t2 - t1 + 3600 * 24);
		} else {
			System.out.println(t2 - t1);
		}
		
		sc.close();
	}
}