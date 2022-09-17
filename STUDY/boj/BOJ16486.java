package boj;
import java.util.*;

public class BOJ16486 { // 운동장 한 바퀴
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt(); // 직사각형의 가로의 길이
		double d2 = sc.nextInt(); // 원의 반지름 길이
		double l = d1 * 2 + d2 * 3.141592 * 2;
		
		System.out.println(l);
		sc.close();
	}
}