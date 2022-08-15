package boj;
import java.util.*;

public class BOJ23972 { // 악마의 제안
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long K = sc.nextLong(); // 악마에게 지불해야 하는 금액
		long N = sc.nextLong(); // 지불하고 남은 금액의 N배
		long X = 0; // 민주가 손해 보지 않기 위해 가지고 있어야 하는 최소 금액
		
		if (N == 1) {
			X = -1;
		} else {
			X = K * N / (N - 1);
			
			if (K * N % (N - 1) > 0) {
				X++;
			}
		}
		
		System.out.println(X);
		sc.close();
	}
}