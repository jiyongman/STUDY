package boj;
import java.util.*;

public class BOJ20944 { // 팰린드롬 척화비
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt(); // 수미상관이면서 팰린드롬인 문자열의 길이
		
		for (int i = 0; i < N; i++) {
			sb.append("a");
		}
		
		System.out.print(sb);
		sc.close();
	}
}