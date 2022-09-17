package codeup;
import java.util.*;

public class CODEUP1093 { // 이상한 출석 번호 부르기1

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 출석 번호를 부른 횟수
		int[] arr = new int[24];
		
		for (int i = 0; i < n; i++) {
			arr[sc.nextInt() - 1]++;
		}
		
		for (int i = 0; i < 23; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
}