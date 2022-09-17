package boj;
import java.util.*;

public class BOJ25304 { // 영수증

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); // 총 금액
		int N = sc.nextInt(); // 구매한 물건의 종류의 수
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt(); // 물건의 가격
			int b = sc.nextInt(); // 물건의 개수
			sum += a * b;
		}

		if (X == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		sc.close();
	}
}