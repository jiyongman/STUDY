package boj;
import java.util.*;

public class BOJ18408 { // 3 つの整数 (Three Integers)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (A + B + C <= 4) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}
		
		sc.close();
	}
}