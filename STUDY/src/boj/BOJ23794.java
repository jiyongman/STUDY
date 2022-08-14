package boj;
import java.util.*;

public class BOJ23794 { // 골뱅이 찍기 - 정사각형
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < N + 2; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.print("@");
			}
			for (int j = 0; j < N; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 1; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < N + 2; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		sc.close();
	}
}