package boj;
import java.util.*;

public class BOJ4948 { // 베르트랑 공준
	
	public static boolean[] bl = new boolean[246913]; // 2 <= 2n <= 246912
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		get_bl();
		
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int cnt = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				if (bl[i] == false) { // i번째 배열이 소수라면
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
		
		sc.close();
	}
	
	public static void get_bl() { // 에라토스테네스의 체 알고리즘
		
		bl[0] = true;
		bl[1] = true;
		
		for (int i = 2; i <= Math.sqrt(bl.length); i++) {
			for (int j = i * i; j < bl.length; j += i) {
				bl[j] = true; // 소수가 아닌 수
			}
		}
	}
}