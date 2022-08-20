package boj;
import java.util.*;

public class BOJ13773 { // Olympic Games
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int y = sc.nextInt();
			
			if (y == 0) {
				break;
			}
			
			if (y % 4 == 0) {
				if (y < 1896) {
					System.out.println(y + " No summer games");
				} else if (y == 1916 || y == 1940 || y == 1944) {
					System.out.println(y + " Games cancelled");
				} else if (y >= 1896 && y <= 2020) {
					System.out.println(y + " Summer Olympics");
				} else if (y > 2020) {
					System.out.println(y + " No city yet chosen");
				}
			} else {
				System.out.println(y + " No summer games");
			}
		}
		
		sc.close();
	}
}