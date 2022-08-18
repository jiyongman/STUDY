package boj;
import java.util.*;

public class BOJ4758 { // Filling Out the Team
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			double a = sc.nextDouble(); // speed
			double b = sc.nextDouble(); // weight
			double c = sc.nextDouble(); // strength
			int cnt = 0;
			
			if (a == 0 && b == 0 && c == 0) {
				break;
			}
			
			if (a <= 4.5 && b >= 150 && c >= 200) {
				System.out.print("Wide Receiver ");
				cnt++;
			}
			
			if (a <= 6.0 && b >= 300 && c >= 500) {
				System.out.print("Lineman ");
				cnt++;
			}
			
			if (a <= 5.0 && b >= 200 && c >= 300) {
				System.out.print("Quarterback ");
				cnt++;
			}
			
			if (cnt == 0) {
				System.out.print("No positions");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}