package boj;
import java.util.*;

public class BOJ9517 { // 아이 러브 크로아티아
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt(); // 폭탄을 들고 있는 사람의 번호
		int N = sc.nextInt(); // 질문의 개수
		int sec = 0;
		
		for (int i = 0; i < N; i++) {
			int T = sc.nextInt(); // 질문을 대답하기까지 걸린 시간(초)
			String Z = sc.next(); // 플레이어의 대답
			
			sec += T;
			
			if (sec > 210) {
				break;
			}
			
			if (Z.equals("T")) {
				K++;
			}
			
			if (K > 8) {
				K = 1;
			}
		}
		
		System.out.println(K);
		sc.close();
	}
}