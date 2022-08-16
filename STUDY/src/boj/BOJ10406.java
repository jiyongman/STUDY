package boj;
import java.util.*;

public class BOJ10406 { // The fellowship of the ring
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt(); // the height of the waist of the opponent
		int N = sc.nextInt(); // the height of his neck
		int P = sc.nextInt(); // the number of thrown punches
		int cnt = 0;
		
		for (int i = 0; i < P; i++) {
			int Hi = sc.nextInt(); // the heights of the punches
			
			if (Hi >= W && Hi <= N) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}