package boj;
import java.util.*;

public class BOJ10599 { // 페르시아의 왕들
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt(); // 출생일의 범위
			int b = sc.nextInt(); // 출생일의 범위
			int c = sc.nextInt(); // 사망일의 범위
			int d = sc.nextInt(); // 사망일의 범위
			int e = c - a;
			int f = d - a;
			int g = c - b;
			int h = d - b;
			
			if (a == 0 && b == 0 && c == 0 && d == 0) {
				break;
			}
			
			System.out.print(Math.min(e, Math.min(f, Math.min(g, h))) + " " + Math.max(e, Math.max(f, Math.max(g, h))));
			System.out.println();
		}
		
		sc.close();
	}
}