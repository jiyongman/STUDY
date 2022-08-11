package boj;
import java.util.*;

public class BOJ5724 { // 파인만
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int N = sc.nextInt(); // 그리드 한 변에 있는 정사각형의 개수
			
			if (N == 0) {
				break;
			}
			
			int sum = 0;
			
			for (int i = 1; i <= N; i++) {
				sum += i * i;
			}
			
			System.out.println(sum);
		}
		
		sc.close();
	}
}