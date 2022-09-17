package boj;
import java.util.*;

public class BOJ20867 { // Rulltrappa
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double M = sc.nextDouble(); // the total number of escalator steps
		double S = sc.nextDouble(); // the number of steps Paulina stand on the escalator
		double G = sc.nextDouble(); // the number of steps Paulina go on the escalator
		double A = sc.nextDouble(); // people per second start going on the escalator out of the left queue
		double B = sc.nextDouble(); // people per second can stand on the escalator from the right queue
		double L = sc.nextDouble(); // how many people go on the left queue
		double R = sc.nextDouble(); // how many people stand on the right queue
		double T1 = 1 / A * L + M / G; // the time for Paulina to go on the escalator
		double T2 = 1 / B * R + M / S; // the time for Paulina to stand on the escalator
		
		if (T1 < T2) {
			System.out.println("friskus");
		} else {
			System.out.println("latmask");
		}
		
		sc.close();
	}
}