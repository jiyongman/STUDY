package boj;
import java.util.*;

public class BOJ11966 { // 2의 제곱인가?
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] arr = new double[31];
		int cnt = 0;
		
		for (int i = 0; i < 31; i++) {
			arr[i] = Math.pow(2, i);
			if (arr[i] == N) {
				cnt++;
			} 
		}
		
		if (cnt == 1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		sc.close();
	}
}