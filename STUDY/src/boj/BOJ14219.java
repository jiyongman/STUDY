package boj;
import java.util.*;

public class BOJ14219 { // 막대과자 포장
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 박스의 가로 길이
		int m = sc.nextInt(); // 박스의 세로 길이
		
		if (n % 3 == 0 || m % 3 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		sc.close();
	}
}