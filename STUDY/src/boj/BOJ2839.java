package boj;
import java.util.*;

public class BOJ2839 { // 설탕 배달
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 0;
		
		while (true) {
			if (N % 5 == 0) {
				num += N / 5;
				System.out.println(num);
				break;
			} else {
				N -= 3;
				num++;
			}
			if (N < 0) {
				System.out.println(-1);
				break;
			}
		}
		
		sc.close();
	}
}