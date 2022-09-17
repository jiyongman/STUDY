package boj;
import java.util.*;

public class BOJ14215 { // 세 막대
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt(); // 길이가 a, b, c인 세 막대
		}
		
		Arrays.sort(arr);
		
		if (arr[0] + arr[1] <= arr[2]) {
			arr[2] = arr[0] + arr[1] - 1;
		}
		
		System.out.println(arr[0] + arr[1] + arr[2]);
		sc.close();
	}
}