package boj;
import java.util.*;

public class BOJ16445 { // Desvendando Monty Hall
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // the number of games in the simulation
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			int X = sc.nextInt(); // the door number that contains the car in that game
			
			if (X == 2 || X == 3) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}