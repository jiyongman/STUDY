package boj;
import java.util.*;

public class BOJ17450 { // 과자 사기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[3];
		
		for (int i = 0; i < 3; i++) {
			double a = sc.nextDouble(); // 과자 한 봉지의 가격
			double b = sc.nextDouble(); // 과자 한 봉지의 무게
			double p = 10 * a;
			double w = 10 * b;
			
			if (p >= 5000) {
				p -= 500;
			}
			
			arr[i] = w / p;
		}
		
		if (Math.max(arr[0], Math.max(arr[1], arr[2])) == arr[0]) {
			System.out.println("S");
		} else if (Math.max(arr[0], Math.max(arr[1], arr[2])) == arr[1]) {
			System.out.println("N");
		} else {
			System.out.println("U");
		}
		
		sc.close();
	}
}