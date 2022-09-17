package boj;
import java.util.*;

public class BOJ2783 { // 삼각 김밥
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double X = sc.nextDouble(); // 세븐25의 삼각 김밥 가격 정보(원)
		double Y = sc.nextDouble(); // 세븐25의 삼각 김밥 가격 정보(그램)
		int N = sc.nextInt(); // 세븐25를 제외한 편의점의 개수
		double min = X * 1000 / Y;
		
		for (int i = 0; i < N; i++) {
			double Xi = sc.nextDouble();
			double Yi = sc.nextDouble();
			double K = Xi * 1000 / Yi;
			min = Math.min(min, K);
		}
		
		System.out.printf("%.2f", min);
		sc.close();
	}
}