package boj;
import java.util.*;

public class BOJ14720 { // 우유 축제
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 우유 가게의 수
		int[] arr = new int[N];
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if (cnt % 3 == arr[i]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}