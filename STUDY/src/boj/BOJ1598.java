package boj;
import java.util.*;

public class BOJ1598 { // 꼬리를 무는 숫자 나열

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() - 1;
		int b = sc.nextInt() - 1;
		int result = 0;
			
		result += Math.abs(a / 4 - b / 4); // 절대값으로 반환 (동서방향거리)
		result += Math.abs(a % 4 - b % 4); // 절대값으로 반환 (남북방향거리)
			
		System.out.println(result);
		sc.close();
	}
}