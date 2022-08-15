package boj;
import java.util.*;

public class BOJ18398 { // HOMWRK
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // the number of test cases
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt(); // the number of problems
			
			for (int j = 0; j < N; j++) {
				int Ai = sc.nextInt();
				int Bi = sc.nextInt();
				
				System.out.println(Ai + Bi + " " + Ai * Bi);
			}
		}
		
		sc.close();
	}
}