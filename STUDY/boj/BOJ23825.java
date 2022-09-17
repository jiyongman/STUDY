package boj;
import java.util.*;

public class BOJ23825 { // SASA 모형을 만들어보자
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 알파벳 S 모양의 블록의 개수
		int M = sc.nextInt(); // 알파벳 A 모양의 블록의 개수
		int S = N / 2;
		int A = M / 2;
		
		System.out.println(Math.min(S, A));
		sc.close();
	}
}