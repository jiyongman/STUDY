package boj;
import java.util.*;

public class BOJ4690 { // 완전 세제곱
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int a = 2; a <= 100; a++) {
			for (int b = 2; b <= a; b++) {
				for (int c = b; c <= a; c++) {
					for (int d = c; d <= a; d++) {
						if (Math.pow(a, 3) == Math.pow(b, 3) + Math.pow(c, 3) + Math.pow(d, 3)) {
							System.out.println("Cube = " + a + ", Triple = (" + b + "," + c + "," + d + ")");
						}
					}
				}
			}
		}
		
		sc.close();
	}
}