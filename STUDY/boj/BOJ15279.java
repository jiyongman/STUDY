package boj;
import java.util.*;

public class BOJ15279 { // Heart Rate
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // the number of cases
		
		for (int i = 0; i < N; i++) {
			double b = sc.nextDouble();
			double p = sc.nextDouble();
			double ABPM = 60 / p;
			double BPM = 60 * b / p;
			
			System.out.printf("%.4f %.4f %.4f\n", BPM - ABPM, BPM, BPM + ABPM);
		}
		
		sc.close();
	}
}