package boj;
import java.util.*;

public class BOJ11720 { // 숫자의 합

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			sum += str.charAt(i) - '0'; // 문자형을 정수형으로 변환
		}
		
		System.out.println(sum);
		sc.close();
	}
}