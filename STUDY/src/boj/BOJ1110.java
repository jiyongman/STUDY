package boj;
import java.util.*;

public class BOJ1110 { // 더하기 사이클

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		int result = N;
        
		while (true) {
			N = (N % 10 * 10) + ((N / 10 + N % 10) % 10);
			cnt++;
 
			if (result == N) {
				break;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}
