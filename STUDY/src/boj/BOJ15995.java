package boj;
import java.util.*;

public class BOJ15995 { // 잉여역수 구하기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int m = sc.nextInt();
		
		for (int i = 0; i < 10001; i++) {
			if (a * i % m == 1) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
}