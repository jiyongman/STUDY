package boj;
import java.util.*;

public class BOJ23805 { // 골뱅이 찍기 - 돌아간 ㄹ
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3 * N; j++) {
				System.out.print("@");
			}
			for (int j = 0; j < N; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < N; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 3 * N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("@");
			}
			for (int j = 0; j < N; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < N; j++) {
				System.out.print("@");
			}
			for (int j = 0; j < N; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < N; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("@");
			}
			for (int j = 0; j < N; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 3 * N; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		sc.close();
	}
}