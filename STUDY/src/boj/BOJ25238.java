package boj;
import java.util.*;

public class BOJ25238 { // 가희와 방어율 무시

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		if (a - (a * (b / 100)) < 100) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		sc.close();
	}
}