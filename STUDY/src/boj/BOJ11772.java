package boj;
import java.util.*;

public class BOJ11772 { // POT
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // the number of the addends from the task
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			int Pi = sc.nextInt();
			sum += Math.pow(Pi / 10, Pi % 10);
		}
		
		System.out.println(sum);
		sc.close();
	}
}