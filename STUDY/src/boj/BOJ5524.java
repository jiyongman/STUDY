package boj;
import java.util.*;

public class BOJ5524 { // 입실 관리
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			str = str.toLowerCase();
			
			System.out.println(str);
		}
		
		sc.close();
	}
}