package boj;
import java.util.*;

public class BOJ16017 { // Telemarketer or not?
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // the first of these four digits
		int b = sc.nextInt(); // the second of these four digits
		int c = sc.nextInt(); // the third of these four digits
		int d = sc.nextInt(); // the last of these four digits
		
		if ((a == 8 || a == 9) && (d == 8 || d == 9) && b == c) {
			System.out.println("ignore");
		} else {
			System.out.println("answer");
		}
		
		sc.close();
	}
}