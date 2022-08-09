package boj;
import java.util.*;

public class BOJ13752 { // 히스토그램
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			char ch = '=';
			
			for (int j = 0; j < k; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
		sc.close();
	}
}