package boj;
import java.util.*;

public class BOJ16673 { // 고려대학교에는 공식 와인이 있다
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt(); // 수빈이가 와인을 모은 년수
		int K = sc.nextInt(); // 수빈이의 고려대 애착 정도
		int P = sc.nextInt(); // 수빈이의 구매중독 정도
		int sum = 0;
		
		for (int i = 1; i <= C; i++) {
			sum += P * i * i + K * i;
		}
		
		System.out.println(sum);
		sc.close();
	}
}