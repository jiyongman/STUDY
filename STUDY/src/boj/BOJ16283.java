package boj;
import java.util.*;

public class BOJ16283 { // Farm
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 양 한 마리가 하루에 먹는 사료의 양
		int b = sc.nextInt(); // 염소 한 마리가 하루에 먹는 사료의 양
		int n = sc.nextInt(); // 상배가 확인한 전체 양과 염소의 마릿수
		int w = sc.nextInt(); // 어제 하루 동안 소비한 전체 사료의 양
		int s = 0; // 양의 마릿수
		int g = 0; // 염소의 마릿수
		int cnt = 0;
		
		for (int i = 1; i < n; i++) {
			if (i * a + (n - i) * b == w) {
				s = i;
				g = n - i;
				cnt++;
			}
		}
		
		if (cnt == 1) {
			System.out.println(s + " " + g);
		} else {
			System.out.println(-1);
		}
		
		sc.close();
	}
}