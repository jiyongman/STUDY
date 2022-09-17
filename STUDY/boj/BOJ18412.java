package boj;
import java.util.*;

public class BOJ18412 { // 文字列の反転 (Inversion of a String)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		char[] arr = new char[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = S.charAt(i);
		}
		
		for (int i = 0; i < A - 1; i++) {
			arr[i] = S.charAt(i);
			System.out.print(arr[i]);
		}
		
		for (int i = B - 1; i > A - 2; i--) {
			arr[i] = S.charAt(i);
			System.out.print(arr[i]);
		}
		
		for (int i = B; i < N; i++) {
			arr[i] = S.charAt(i);
			System.out.print(arr[i]);
		}
		
		sc.close();
	}
}