package boj;
import java.util.*;

public class BOJ10262 { // 주사위 게임
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int a3 = sc.nextInt();
		int b3 = sc.nextInt();
		int a4 = sc.nextInt();
		int b4 = sc.nextInt();
		int sum = 0;
		int sum2 = 0;
		sum = a1 + b1 + a2 + b2;
		sum2 = a3 + b3 + a4 + b4;
		
		if (sum > sum2) {
			System.out.println("Gunnar");
		} else if (sum < sum2) {
			System.out.println("Emma");
		} else {
			System.out.println("Tie");
		}
		
		sc.close();
	}
}