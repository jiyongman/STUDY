package boj;
import java.util.*;

public class BOJ11024 { // 더하기 4
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine()); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			int sum = 0;
			
			while (st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			System.out.println(sum);
		}
		
		sc.close();
	}
}