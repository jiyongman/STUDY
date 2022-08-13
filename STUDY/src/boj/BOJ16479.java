package boj;
import java.util.*;

public class BOJ16479 { // 컵라면 측정하기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double K = sc.nextDouble(); // 민수가 아직 측정하지 않은 변의 길이
		double D1 = sc.nextDouble(); // 민수가 측정한 컵라면의 윗면의 지름
		double D2 = sc.nextDouble(); // 민수가 측정한 컵라면의 아랫면의 지름
		double result = 0;
		
		if (D1 == D2) {
			result = K * K;
		} else {
			result = K * K - Math.pow(((D1 - D2) / 2), 2);
		}
		
		System.out.println(result);
		sc.close();
	}
}