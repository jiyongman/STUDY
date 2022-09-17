package boj;
import java.util.*;

public class BOJ20673 { // Covid-19
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt(); // the average number of new cases per day
		int q = sc.nextInt(); // the average number of new hospitalizations per day
		
		if (p <= 50 && q <= 10) {
			System.out.println("White");
		} else if (q > 30) {
			System.out.println("Red");
		} else {
			System.out.println("Yellow");
		}
		
		sc.close();
	}
}