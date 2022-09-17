package boj;
import java.util.*;

public class BOJ4766 { // 일반 화학 실험
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		
		while (true) {
			double b = sc.nextDouble();
			
			if (b == 999) {
				break;
			}
			
			System.out.printf("%.2f", b - a);
			System.out.println();
			a = b;
		}
		
		sc.close();
	}
}