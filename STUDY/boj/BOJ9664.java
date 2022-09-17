package boj;
import java.util.*;

public class BOJ9664 { // NASLJEDSTVO
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // the number of daughters
		int O = sc.nextInt(); // the number of remaining medallions
		int M = O + O / (N - 1); // the number of medallions
		
		if (O % (N - 1) == 0) {
			System.out.println(M - 1 + " " + M);
		} else {
			System.out.println(M + " " + M);
		}
		
		sc.close();
	}
}