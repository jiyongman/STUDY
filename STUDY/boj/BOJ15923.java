package boj;
import java.util.*;

public class BOJ15923 { // 욱제는 건축왕이야!!
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 꼭짓점의 개수
		int max = 0;
		int max2 = 0;
		int min = 40;
		int min2 = 40;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt(); // 꼭짓점의 x 좌표
			int y = sc.nextInt(); // 꼭짓점의 y 좌표
			max = Math.max(max, x); // x 좌표의 최댓값
			min = Math.min(min, x); // x 좌표의 최솟값
			max2 = Math.max(max2, y); // y 좌표의 최댓값
			min2 = Math.min(min2, y); // y 좌표의 최솟값
		}
		
		System.out.println(((max - min) + (max2 - min2)) * 2);
		sc.close();
	}
}