package boj;
import java.util.*;

public class BOJ21354 { // Äpplen och päron
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // the number of apples Axel has managed to sell
		int P = sc.nextInt(); // the number of pears Petra has managed to sell
		
		if (A * 7 > P * 13) {
			System.out.println("Axel");
		} else if (A * 7 < P * 13) {
			System.out.println("Petra");
		} else {
			System.out.println("lika");
		}
		
		sc.close();
	}
}