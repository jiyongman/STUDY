package boj;
import java.util.*;

public class BOJ20232 { // Archivist
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt(); // the year
		
		if (y == 1996 || y == 1997 || y == 2000 || y == 2007 || y == 2008 || y == 2013 || y == 2018) {
			System.out.println("SPbSU");
		} else if (y == 2006) {
			System.out.println("PetrSU, ITMO");
		} else {
			System.out.println("ITMO");
		}
		
		sc.close();
	}
}