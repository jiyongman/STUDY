package boj;
import java.util.*;

public class BOJ15178 { // Angles
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // the number of pupils who have supplied readings
		
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt(); // the measurements supplied by a pupil for the first angle of a triangle
			int b = sc.nextInt(); // the measurements supplied by a pupil for the second angle of a triangle
			int c = sc.nextInt(); // the measurements supplied by a pupil for the third angle of a triangle
			
			if (a + b + c == 180) {
				System.out.println(a + " " + b + " " + c + " Seems OK");
			} else {
				System.out.println(a + " " + b + " " + c + " Check");
			}
		}
		
		sc.close();
	}
}