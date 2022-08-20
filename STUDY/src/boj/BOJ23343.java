package boj;
import java.util.*;

public class BOJ23343 { // JavaScript
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String y = sc.next();
		
		try {
			System.out.println(Integer.parseInt(x) - Integer.parseInt(y));
		} catch (Exception e) {
			System.out.println("NaN");
		}
		
		sc.close();
	}
}