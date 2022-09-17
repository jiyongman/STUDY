package boj;
import java.util.*;

public class BOJ14761 { // FizzBuzz
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); 
		int Y = sc.nextInt();
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			if (i % X == 0 && i % Y == 0) {
				System.out.println("FizzBuzz");
			} else if (i % X == 0) {
				System.out.println("Fizz");
			} else if (i % Y == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}