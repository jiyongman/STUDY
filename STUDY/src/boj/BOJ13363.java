package boj;
import java.util.*;

public class BOJ13363 { // Jumbled Compass
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(); // the current direction of the needle
		int n2 = sc.nextInt(); // the correct direction of the needle
		
		if (n2 - n1 <= -180) {
			System.out.println(n2 - n1 + 360);
		} else if(n2 - n1 > 180) {
			System.out.println(n2 - n1 - 360);
		} else {
			System.out.println(n2 - n1);
		}
		
		sc.close();
	}
}