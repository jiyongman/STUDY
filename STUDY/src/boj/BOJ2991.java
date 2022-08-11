package boj;
import java.util.*;

public class BOJ2991 { // 사나운 개 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // dog1 공격시간
		int B = sc.nextInt(); // dog1 휴식시간
		int C = sc.nextInt(); // dog2 공격시간
		int D = sc.nextInt(); // dog2 휴식시간
		int[] arr = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt(); // 우체부, 우유배달원, 신문배달원의 도착 시간
			int cnt = 0;
			int dog1 = arr[i] % (A + B);
			int dog2 = arr[i] % (C + D);
			
			if (dog1 > 0 && dog1 <= A) {
				cnt++;
			}
			
			if (dog2 > 0 && dog2 <= C) {
				cnt++;
			}
			
			System.out.println(cnt);
		}
		
		sc.close();
	}
}