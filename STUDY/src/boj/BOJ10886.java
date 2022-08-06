package boj;
import java.util.*;

public class BOJ10886 { // 0 = not cute / 1 = cute

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			if (arr[i] == 1) {
				cnt++;
			} else {
				cnt--;
			}
		}
		
		if (cnt > 0) {
			System.out.println("Junhee is cute!");
		} else {
			System.out.println("Junhee is not cute!");
		}
		
		sc.close();
	}
}