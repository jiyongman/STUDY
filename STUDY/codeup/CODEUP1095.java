package codeup;
import java.util.*;

public class CODEUP1095 { // 이상한 출석 번호 부르기3
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 번호를 부른 횟수
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); // 오름차순으로 정렬
		System.out.println(arr[0]);
		sc.close();
	}
}