package boj;
import java.util.*;

public class BOJ5717 { // 상근이의 친구들
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int M = sc.nextInt(); // 상근이의 남자 친구의 수
			int F = sc.nextInt(); // 상근이의 여자 친구의 수
			
			if (M == 0 && F == 0) {
				break;
			}
			
			System.out.println(M + F);
		}
		
		sc.close();
	}
}