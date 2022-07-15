package boj;
import java.util.*;

public class BOJ5597 { // 과제 안 내신분..?

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[31];
		
		for (int i = 1; i <= 28; i++) { // 과제 제출 학생의 출석번호에 1 입력
			int num = sc.nextInt();
			arr[num] = 1;
		}
		
		for (int i = 1; i <= 30; i++) { // 과제 미제출 학생의 출석번호 출력
			if (arr[i] == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}