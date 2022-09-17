package boj;
import java.util.*;

public class BOJ4084 { // Viva la Diferencia

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();
			int cnt = 0;
			
			if (a == 0 && b == 0 && c == 0 && d == 0) {
				break;
			}
			
			while (true) {
				
				if (a == b && b == c && c == d) {
					break;
				}
				
				long tmp = a;
				a = Math.abs(a - b);
				b = Math.abs(b - c);
				c = Math.abs(c - d);
				d = Math.abs(d - tmp);
				cnt++;
			}
			
			System.out.println(cnt);
		}
		
		sc.close();
	}
}