package boj;
import java.util.*;

public class BOJ6378 { // 디지털 루트
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String N = sc.next(); // 문자열 양의 정수
			
			if (N.equals("0")) {
				break;
			}
			
			while (true) {
				int sum = 0;
				
				if (N.length() < 2) {
					System.out.println(N);
					break;
				} else {
					for (int i = 0; i < N.length(); i++) {
						sum += N.charAt(i) - '0';
					}
				}
				N = String.valueOf(sum); // 정수형 sum을 문자열로 변환
			}
		}
		
		sc.close();
	}
}