package boj;
import java.util.*;

public class BOJ23348 { // 스트릿 코딩 파이터
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 한손 코딩의 난이도
		int B = sc.nextInt(); // 노룩 코딩의 난이도
		int C = sc.nextInt(); // 폰코딩의 난이도
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				int a = sc.nextInt(); // 동아리원이 사용한 한손 코딩의 횟수
				int b = sc.nextInt(); // 동아리원이 사용한 노룩 코딩의 횟수
				int c = sc.nextInt(); // 동아리원이 사용한 폰코딩의 횟수
				
				arr[i] += A * a + B * b + C * c;
			}
		}
		
		Arrays.sort(arr);
		System.out.println(arr[N - 1]);
		sc.close();
	}
}