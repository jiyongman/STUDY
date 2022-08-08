package boj;
import java.util.*;

public class BOJ10569 { // 다면체
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int V = sc.nextInt(); // 꼭짓점의 개수
			int E = sc.nextInt(); // 모서리의 개수
			int F = E - V + 2;
			
			System.out.println(F);
		}
		
		sc.close();
	}
}