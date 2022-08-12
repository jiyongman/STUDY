package boj;
import java.util.*;

public class BOJ12756 { // 고급 여관
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 플레이어 A가 꺼낸 카드의 공격력
		int b = sc.nextInt(); // 플레이어 A가 꺼낸 카드의 생명력
		int c = sc.nextInt(); // 플레이어 B가 꺼낸 카드의 공격력
		int d = sc.nextInt(); // 플레이어 B가 꺼낸 카드의 생명력
		
		while (true) {
			b -= c;
			d -= a;
			
			if (d <= 0 && b <= 0) {
				System.out.println("DRAW");
				break;
			} else if (d <= 0) {
				System.out.println("PLAYER A");
				break;
			} else if (b <= 0) {
				System.out.println("PLAYER B");
				break;
			}
		}
		
		sc.close();
	}
}