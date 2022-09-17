package boj;
import java.util.*;

public class BOJ15820 { // 맞았는데 왜 틀리죠?
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int S1 = sc.nextInt(); // 샘플 테스트 케이스의 개수
		int S2 = sc.nextInt(); // 시스템 테스트 케이스의 개수
		int cnt = 0;
		int cnt2 = 0;
		
		for (int i = 0; i < S1; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if (A != B) {
				cnt++;
			}
		}
		
		for (int i = 0; i < S2; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if (A != B) {
				cnt2++;
			}
		}
		
		if (cnt == 0 && cnt2 == 0) {
			System.out.println("Accepted");
		} else if (cnt > 0) {
			System.out.println("Wrong Answer");
		} else if (cnt2 > 0) {
			System.out.println("Why Wrong!!!");
		}
		
		sc.close();
	}
}