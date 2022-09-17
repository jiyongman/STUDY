package boj;
import java.util.*;
 
public class BOJ5063 { // TGN
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			int r = sc.nextInt(); // 광고를 하지 않았을 때의 수익
			int e = sc.nextInt(); // 광고를 했을 때의 수익
			int c = sc.nextInt(); // 광고 비용
			
			if (e - c > r) {
				System.out.println("advertise");
			} else if (e - c < r) {
				System.out.println("do not advertise");
			} else {
				System.out.println("does not matter");
			}
		}
		
		sc.close();
	}
}