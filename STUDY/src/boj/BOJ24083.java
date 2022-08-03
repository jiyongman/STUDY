package boj;
import java.util.*;

public class BOJ24083 { // 短針 (Hour Hand)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // the number of the hour hand pointed to a scale
		int B = sc.nextInt(); // the number of the hour hand have passed since the hour hand points to A
		int X = (A + B) % 12; 
		
		if (X == 0) {
			X = 12;
		}
		
		System.out.println(X);
		sc.close();
	}
}