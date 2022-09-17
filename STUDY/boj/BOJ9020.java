package boj;
import java.util.*;

public class BOJ9020 { // 골드바흐의 추측
	
	public static boolean[] bl = new boolean[10001];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		get_bl();
		
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			int a = n / 2;
			int b = n / 2;
			while (true) {
				if (bl[a] == false && bl[b] == false) { // 둘 다 소수라면
					System.out.println(a + " " + b);
					break;
				}
				a--;
				b++;
			}
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