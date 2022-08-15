package boj;
import java.util.*;

public class BOJ25175 { // 두~~부 두부 두부
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 게임을 하는 사람의 수
		int M = sc.nextInt(); // 현재 차례인 사람의 번호
		int K = sc.nextInt(); // 부른 두부의 모 수
		
		int X = (K - 3) % N;
		System.out.println((M - 1 + X + N) % N + 1);
		sc.close();
	}
}