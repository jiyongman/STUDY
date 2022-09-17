package boj;
import java.util.*;

public class BOJ14038 { // Tournament Selection
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] arr = new char[6];
		
		for (int i = 0; i < 6; i++) { // each with one of two possible letters: W (to indicate a win) or L (to indicate a loss)
			arr[i] = sc.next().charAt(0);
		}
		
		int cnt = 0;
		
		for (int i = 0; i < 6; i++) {
			if (arr[i] == 'W') {
				cnt++;
			}
		}
		
		if (cnt >= 5) {
			System.out.println(1);
		} else if (cnt >= 3) {
			System.out.println(2);
		} else if (cnt >= 1) {
			System.out.println(3);
		} else {
			System.out.println(-1);
		}
		
		sc.close();
	}
}