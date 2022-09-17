package boj;
import java.util.*;

public class BOJ25314 { // 코딩은 체육과목 입니다

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N / 4; i++) {
			System.out.print("long" + " ");	
		}
		
		System.out.print("int");
		sc.close();
	}
}