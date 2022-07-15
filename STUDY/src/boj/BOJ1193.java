package boj;
import java.util.*;

public class BOJ1193 { // 분수찾기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int cnt = 1; // 대각선의 원소 개수
		int sum = 0; // 직전 대각선까지의 원소 개수
		
		while (true) {
			if (X <= cnt + sum) {
				if (cnt % 2 == 1) {
					System.out.print((cnt - (X - sum) + 1) + "/" + (X - sum));
					break;
				} else {
					System.out.print((X - sum) + "/" + (cnt - (X - sum) + 1));
					break;
				}
			} else {
				sum += cnt;
				cnt++;
			}
		}
		
		sc.close();
	}
}