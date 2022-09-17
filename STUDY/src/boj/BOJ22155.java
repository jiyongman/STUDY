package boj;
import java.util.*;

public class BOJ22155 { // Простая задача
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int j = 0; j < n; j++) {
			int i = sc.nextInt();
			int f = sc.nextInt();
			
			if ((i <= 2 && f <= 1) || (i <= 1 && f <= 2)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		
		sc.close();
	}
}