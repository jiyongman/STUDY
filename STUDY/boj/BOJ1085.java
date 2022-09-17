package boj;
import java.util.*;

public class BOJ1085 { // 직사각형에서 탈출
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int a = Math.min(x, w-x); // 가장 작은 수 리턴
		int b = Math.min(y, h-y); // 가장 작은 수 리턴
		
		System.out.println(Math.min(a, b));
		sc.close();
	}
}