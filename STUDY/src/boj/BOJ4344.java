package boj;
import java.util.*;

public class BOJ4344 { // 평균은 넘겠지

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
        int[] arr;
		
		for(int i = 0; i < C; i++) {
			int N = sc.nextInt();
			arr = new int[N];
			double sum = 0;
			
			for(int j = 0; j < N; j++) {
				int score = sc.nextInt();
				arr[j] = score;
				sum += score;
			}
			
			double mean = (sum / N);
			double cnt = 0;
			
			for(int j = 0 ; j < N ; j++) {
				if(arr[j] > mean) {
					cnt++;
				}
			}
			
			System.out.printf("%.3f%%\n",(cnt / N) * 100); // 소수 셋째 자리까지 출력
		}
		
		sc.close();
	}
}
