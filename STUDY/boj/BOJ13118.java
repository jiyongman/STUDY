package boj;
import java.util.*;

public class BOJ13118 { // 뉴턴과 사과
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		
		for (int i = 0; i < 4; i++) { // 사람들의 위치
			arr[i] = sc.nextInt();
		}
		
		int x = sc.nextInt(); // 사과의 x축
		int y = sc.nextInt(); // 사과의 y축
		int r = sc.nextInt(); // 사과의 반지름
		int num = 0;
		
		for (int i = 0; i < 4; i++) {
			if(arr[i] == x) {
				num = i + 1;
			}
		}
		
		System.out.println(num);
		sc.close();
	}
}