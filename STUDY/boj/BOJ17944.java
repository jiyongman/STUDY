package boj;
import java.util.*;

public class BOJ17944 { // 퐁당퐁당 1
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 게임에 참여하는 사람 수
		int T = sc.nextInt(); // 계산해야하는 차례
		int X = T % (4 * N - 2);
		
		if (X <= 2 * N) {
			System.out.println(X);
		} else {
			System.out.println(4 * N - X);
		}
		
		sc.close();
	}
}