package boj;
import java.util.*;

public class BOJ1145 { // 적어도 대부분의 배수

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		int result = 1;
		
		while (true) {
			cnt = 0;
			for (int j = 0; j < 5; j++) {
				if (result % arr[j] == 0) {
					cnt++;
				}
			}
			
			if (cnt >= 3) {
				System.out.println(result);
				break;
			} else {
				cnt = 0;
				result++;
			}
		}
		
		sc.close();
	}	
}