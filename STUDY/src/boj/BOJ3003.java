package boj;
import java.util.*;

public class BOJ3003 { // 킹, 퀸, 룩, 비숍, 나이트, 폰

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 1, 2, 2, 2, 8};
		
		for (int i = 0; i < arr.length; i++) {
			int a = sc.nextInt(); // 동혁이가 찾은 말의 개수
			System.out.print(arr[i] - a + " ");
		}
		
		sc.close();
	}
}