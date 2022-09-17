package boj;
import java.util.*;

public class BOJ2863 { // 이게 분수?
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double D = sc.nextDouble();
		double E = A / C + B / D; // 0번 회전
		double F = C / D + A / B; // 1번 회전
		double G = D / B + C / A; // 2번 회전
		double H = B / A + D / C; // 3번 회전
		
		if (Math.max(E, Math.max(F, Math.max(G, H))) == E) {
			System.out.println(0);
		} else if (Math.max(E, Math.max(F, Math.max(G, H))) == F) {
			System.out.println(1);
		} else if (Math.max(E, Math.max(F, Math.max(G, H))) == G) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
		
		sc.close();
	}
}