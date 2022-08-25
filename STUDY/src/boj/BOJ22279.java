package boj;
import java.util.*;

public class BOJ22279 { // Quality-Adjusted Life-Year
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // the number of periods of constant quality of life during the person's lifetime
		double result = 0;
		
		for (int i = 0; i < N; i++) {
			double q = sc.nextDouble();
			double y = sc.nextDouble();
			result += q * y;
		}	
		
		System.out.println(result);
		sc.close();
	}
}