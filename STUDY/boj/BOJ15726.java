package boj;
import java.util.*;

public class BOJ15726 { // 이칙연산
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();
		double B = sc.nextInt();
		double C = sc.nextInt();
		
		if (A * B / C > A / B * C) {
			System.out.println((int) (A * B / C));
		} else {
			System.out.println((int) (A / B * C));
		}
		
		sc.close();
	}
}