package boj;
import java.util.*;

public class BOJ23971 { // ZOAC 4
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double H = sc.nextDouble(); // 테이블의 행 개수
		double W = sc.nextDouble(); // 테이블의 열 개수
		double N = sc.nextDouble(); // 비워야 하는 세로 칸 수
		double M = sc.nextDouble(); // 비워야 하는 가로 칸 수
		
		System.out.println((int) (Math.ceil(H / (N + 1)) * Math.ceil(W / (M + 1))));
		sc.close();
	}
}