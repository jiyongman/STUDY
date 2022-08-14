package boj;
import java.util.*;

public class BOJ17284 { // Vending Machine
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 5000;
		
		while (sc.hasNext()) {
			int a = sc.nextInt();
			
			if (a == 1) {
				n -= 500;
			} else if (a == 2) {
				n -= 800;
			} else {
				n -= 1000;
			}
		}
		
		System.out.println(n);
		sc.close();
	}
}