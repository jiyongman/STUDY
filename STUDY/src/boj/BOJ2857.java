package boj;
import java.util.*;

public class BOJ2857 { // FBI
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[5];
		int cnt = 0;
		
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.next();
		}
		
		for (int i = 0; i < 5; i++) {
			if (arr[i].contains("FBI")) {
				System.out.print((i + 1) + " ");
				cnt++;
			}
		}
		
		if (cnt == 0) {
			System.out.print("HE GOT AWAY!");
		}
		
		sc.close();
	}
}