package boj;
import java.util.*;

public class BOJ17618 { // 신기한 수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		
		for (int i = 1; i <= N; i++) {
			int num = i;
			int sum = 0;
			
			while (true) {
				
				if (num == 0) {
					break;
				}
				
				sum += num % 10;
				num /= 10;
			}
			
			if (i % sum == 0) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}