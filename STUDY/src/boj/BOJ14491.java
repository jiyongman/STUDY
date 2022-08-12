package boj;
import java.util.*;

public class BOJ14491 { // 9진수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 10진수
		int result = 0;
		int cnt = 0;
		
		while (T > 0) {
			result += T % 9 * Math.pow(10, cnt++);
			T /= 9;
		}
		
		System.out.println(result);
		sc.close();
	}
}