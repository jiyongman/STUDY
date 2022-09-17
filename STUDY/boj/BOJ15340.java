package boj;
import java.util.*;

public class BOJ15340 { // Sim Card
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int c = sc.nextInt(); // the amount of call (in minutes)
			int d = sc.nextInt(); // the amount of data usage (in megabytes) for the student
			
			if (c == 0 && d == 0) {
				break;
			}
			
			int ParsTel = 30 * c + 40 * d;
			int ParsCell = 35 * c + 30 * d;
			int ParsPhone = 40 * c + 20 * d;
			int min = Math.min(ParsTel, Math.min(ParsCell, ParsPhone)); // the minimum total cost of call usage and data usage
			
			System.out.println(min);
		}
		
		sc.close();
	}
}