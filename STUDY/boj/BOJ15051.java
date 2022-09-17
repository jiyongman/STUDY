package boj;
import java.util.*;

public class BOJ15051 { // Máquina de café

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A1 = sc.nextInt(); // the number of people working on the first floor
		int A2 = sc.nextInt(); // the number of people working on the second floor
		int A3 = sc.nextInt(); // the number of people working on the third floor
		int sum = Math.min(A2 * 2 + A3 * 4, Math.min(A1 * 2 + A3 * 2, A1 * 4 + A2 * 2));
		
		System.out.println(sum);
		sc.close();
	}
}