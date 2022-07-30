package boj;
import java.util.*;

public class BOJ17388 { // 와글와글 숭고한
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt(); // 숭실대학교의 참여도
		int K = sc.nextInt(); // 고려대학교의 참여도
		int H = sc.nextInt(); // 한양대학교의 참여도
		
		if (S + K + H >= 100) { 
			System.out.println("OK");
		} else if (S < K && S < H) {
			System.out.println("Soongsil");
		} else if (K < S && K < H) {
			System.out.println("Korea");
		} else {
			System.out.println("Hanyang");
		}
		
		sc.close();
	}
}