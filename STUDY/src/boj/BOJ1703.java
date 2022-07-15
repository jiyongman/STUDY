package boj;
import java.util.*;

public class BOJ1703 { // 생장점

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt(); // 나무의 나이
			int cnt = 1;
			
			if (a == 0) {
				break;
			}
			
			for (int i = 0; i < a; i++) {
				int b = sc.nextInt(); // splitting factor 수
				int c = sc.nextInt(); // 가지치기 한 가지의 수
				cnt = cnt * b - c;
			}
			
			System.out.println(cnt);
		}
		
		sc.close();
	}
}