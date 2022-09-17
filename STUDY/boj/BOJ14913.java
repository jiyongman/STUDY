package boj;
import java.util.*;

public class BOJ14913 { // 등차수열에서 항 번호 찾기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 첫 항
		int d = sc.nextInt(); // 공차
		int k = sc.nextInt(); // 찾는 수
		
		if ((k - a) % d == 0 && (k - a) / d >= 0) {
			System.out.println((k - a) / d + 1);
		} else {
			System.out.println("X");
		}
		
		sc.close();
	}
}