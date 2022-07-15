package boj;
import java.util.*;

public class BOJ1268 { // 임시 반장 정하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 학생 수
		int[][] arr = new int[N][5]; // 행: 학생 수, 열: 학년
		int max = 0;
		int num = 0; 
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < N; i++) {
			Set<Integer> set = new HashSet<Integer>(); // 객체 선언 (중복 x)
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < N; k++) {
					if (i != k && arr[i][j] == arr[k][j]) {
						set.add(k); // 데이터 삽입
					}
				}
			}
			
			if (max < set.size()) { // 데이터 크기 비교
				max = set.size();
				num = i;
			}
		}
		
		System.out.println(num + 1);
		sc.close();
	}
}