package boj;
import java.util.*;

public class BOJ4623 { // Copier Reduction
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			double A = sc.nextDouble(); // an AxBmm image piece of paper
			double B = sc.nextDouble(); // an AxBmm image piece of paper
			double C = sc.nextDouble(); // a CxDmm piece of paper
			double D = sc.nextDouble(); // a CxDmm piece of paper
			
			if (A == 0 && B == 0 && C == 0 && D == 0) {
				break;
			}
			
			double P = Math.min(Math.max(C, D) / Math.max(A, B), Math.min(C, D) / Math.min(A, B));
			
			if (P >= 1) {
				System.out.println("100%");
			} else if (P <= 0.01) {
				System.out.println("1%");
			} else {
				System.out.println((int) (P * 100) + "%");
			}
		}
		
		sc.close();
	}
}