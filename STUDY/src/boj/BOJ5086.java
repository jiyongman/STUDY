package boj;
import java.util.*;

public class BOJ5086 { // 배수와 약수

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a == 0 && b == 0) {
				break;
			}
			
			if (a % b == 0) {
				System.out.println("multiple");
			} else if (b % a == 0) {
				System.out.println("factor");
			} else {
				System.out.println("neither");
			}
		}
		
		sc.close();
	}
}