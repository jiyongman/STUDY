package boj;
import java.util.*;

public class BOJ15151 { // Incomplete Book
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(); // the number of days needed to write the first book
		int d = sc.nextInt(); // the number of days after he started writing the first book that he will die
		int sum = 0;
		int i = 0;
		
		while (true) {
			sum += k;
			
			if (sum > d) {
				break;
			}
			
			k *= 2;
			i++;
		}
		
		System.out.println(i);
		sc.close();
	}
}