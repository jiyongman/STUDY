package boj;
import java.util.*;

public class BOJ10984 { // 내 학점을 구해줘
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 학기의 수
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt(); // 들었던 과목의 수
			int credit = 0;
			float grade = 0;
			
			for (int j = 0; j < N; j++) {
				int C = sc.nextInt(); // 과목들의 학점
				float G = sc.nextFloat(); // 과목들의 성적
				credit += C;
				grade += C * G;
			}
			
			System.out.println(credit + " " + Math.round(grade * 10 / credit) / 10.0);
		}
		
		sc.close();
	}
}