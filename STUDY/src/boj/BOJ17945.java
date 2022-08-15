package boj;
import java.util.*;

public class BOJ17945 { // 통학의 신
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 이차방정식 x^2 + 2Ax + B = 0에서의 A
		int B = sc.nextInt(); // 이차방정식 x^2 + 2Ax + B = 0에서의 B
		double x1 = - A - Math.sqrt(A * A - B); // 짝수 근의 공식
		double x2 = - A + Math.sqrt(A * A - B); // 짝수 근의 공식
		
		if (x1 == x2) {
			System.out.println((int) x1);
		} else {
			System.out.println((int) x1 + " " + (int) x2);
		}
		
		sc.close();
	}
}