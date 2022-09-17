package boj;
import java.util.*;

public class BOJ11648 { // 지속
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		
		while (N >= 10) {
			int num = 1;
			
			while (N > 0) {
				num *= N % 10;
				N /= 10;
			}
			
			N = num;
			cnt++;
		}
		
		System.out.println(cnt);
		sc.close();
	}
}