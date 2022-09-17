package boj;
import java.util.*;

public class BOJ6768 { // Don’t pass me the ball!
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int J = sc.nextInt(); //  the jersey number of the goal scorer
		
		System.out.println((J - 1) * (J - 2) * (J - 3) / 6);
		sc.close();
	}
}