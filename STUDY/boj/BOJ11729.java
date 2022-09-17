package boj;
import java.util.*;

public class BOJ11729 { // 하노이 탑 이동 순서
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');
		
		recursive(N, 1, 2, 3);
		System.out.println(sb);
		sc.close();
	}
	
	public static void recursive(int N, int a, int b, int c) {
		
		if (N == 1) { // 이동할 원반의 수가 1개인 경우
			sb.append(a + " " + c + "\n");
			return;
		}
		
		recursive(N - 1, a, c, b); // N-1개를 a에서 b로 이동
		sb.append(a + " " + c + "\n"); // 1개를 a에서 c로 이동
		recursive(N - 1, b, a, c); // N-1개를 b에서 c로 이동
	}
}