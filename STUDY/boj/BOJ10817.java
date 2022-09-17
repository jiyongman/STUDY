package boj;
import java.util.*;

public class BOJ10817 { // 세 수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); // 오름차순으로 정렬
		System.out.println(arr[1]);
		sc.close();
	}
}