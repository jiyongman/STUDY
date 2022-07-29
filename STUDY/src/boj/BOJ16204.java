package boj;
import java.util.*;

public class BOJ16204 { // 카드 뽑기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int O = Math.min(M, K); // 앞 면과 뒷 면이 O
		int X = Math.min(N - M, N - K); // 앞 면과 뒷 면이 X
		
		System.out.println(O + X);
		sc.close();
	}
}