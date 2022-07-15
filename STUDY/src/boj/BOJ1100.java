package boj;
import java.util.*;

public class BOJ1100 { // 하얀 칸

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		for (int i = 0; i < 8; i++) {
			String str = sc.next();
			
			for (int j = 0; j < 8; j++) {
				if ((i + j) % 2 == 0 && str.charAt(j) == 'F')
					cnt++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}