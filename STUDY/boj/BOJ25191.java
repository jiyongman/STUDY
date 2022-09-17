package boj;
import java.util.*;

public class BOJ25191 { // 치킨댄스를 추는 곰곰이를 본 임스
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 치킨집에 있는 치킨의 총 개수
		int A = sc.nextInt(); // 임스의 집에 있는 콜라의 개수
		int B = sc.nextInt(); // 임스의 집에 있는 맥주의 개수
		
		System.out.println(Math.min(N, A / 2 + B));
		sc.close();
	}
}