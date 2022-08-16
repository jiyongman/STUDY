package boj;
import java.util.*;

public class BOJ13129 { // Disposable Cup
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt(); // 종이컵의 개수
		
		for (int i = 1; i <= N; i++) {
			System.out.print(N * A + i * B + " ");
		}
		
		sc.close();
	}
}