package boj;
import java.util.*;

public class BOJ17783 { // Breaking Branches
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // the length of the branch
		
		if (n % 2 == 0) {
			System.out.println("Alice");
			System.out.println(1);
		} else {
			System.out.println("Bob");
		}
		
		sc.close();
	}
}