package codeup;
import java.util.*;

public class CODEUP1091 { // 수 나열하기3
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		long a = sc.nextLong(); // 시작 값
		int m = sc.nextInt(); // 곱할 값
		int d = sc.nextInt(); // 더할 값
		int n = sc.nextInt(); // 몇 번째 인지를 나타내는 정수
		
		for (int i = 1; i < n; i++) {
			a = (a * m) + d;
		}
		
		System.out.println(a);
		sc.close();
	}
}