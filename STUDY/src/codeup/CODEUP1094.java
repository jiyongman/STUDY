package codeup;
import java.util.*;

public class CODEUP1094 { // 이상한 출석 번호 부르기2
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 번호를 부른 횟수
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
}