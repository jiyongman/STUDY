package boj;
import java.util.*;

public class BOJ14656 { // 조교는 새디스트야!!
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 헌우네 반 학생의 수
		int[] arr = new int[N];
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] != i + 1) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}