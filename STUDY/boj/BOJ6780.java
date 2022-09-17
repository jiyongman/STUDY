package boj;
import java.util.*;

public class BOJ6780 { // Sumac Sequences
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int cnt = 2;
		
		while (t1 >= t2) {
			int tmp = t1 - t2;
			t1 = t2;
			t2 = tmp;
			cnt++;
		}
		
		System.out.println(cnt);
		sc.close();
	}
}