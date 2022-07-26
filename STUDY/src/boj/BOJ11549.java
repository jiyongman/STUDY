package boj;
import java.util.*;

public class BOJ11549 { // Identifying tea
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // the tea type
		int[] arr = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		
		for (int i = 0; i < 5; i++) {
			if (T == arr[i]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}