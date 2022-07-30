package boj;
import java.util.*;

public class BOJ19698 { // 헛간 청약
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 소들의 수
		int W = sc.nextInt(); // 헛간의 크기
		int H = sc.nextInt(); // 헛간의 크기
		int L = sc.nextInt(); // 소들에게 배정되는 공간의 크기
		int C = (W / L) * (H / L); // 소들에게 배정될 수 있는 공간의 개수
		
		if (N >= C) {
			System.out.println(C);
		} else {
			System.out.println(N);
		}
		
		sc.close();
	}
}