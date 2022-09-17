package boj;
import java.util.*;

public class BOJ21665 { // Миша и негатив
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] arr = new char[n][m];
		char[][] arr2 = new char[n][m];
		
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			
			for (int j = 0; j < m; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			String str2 = sc.next();
			
			for (int j = 0; j < m; j++) {
				arr2[i][j] = str2.charAt(j);
				if (arr[i][j] == arr2[i][j]) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}