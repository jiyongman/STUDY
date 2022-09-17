package boj;
import java.util.*;

public class BOJ13684 { // Divisão da Nlogõnia
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int K = sc.nextInt(); // the number of queries
			
			if (K == 0) {
				break;
			}
			
			int N = sc.nextInt(); // the coordinates of the dividing point (N, M)
			int M = sc.nextInt(); // the coordinates of the dividing point (N, M)
			
			for (int i = 0; i < K; i++) {
				int X = sc.nextInt(); // the coordinates of a residence
				int Y = sc.nextInt(); // the coordinates of a residence
				
				if (X > N && Y > M) {
					System.out.println("NE");
				} else if (X < N && Y > M) {
					System.out.println("NO");
				} else if (X < N && Y < M) {
					System.out.println("SO");
				} else if (X > N && Y < M) {
					System.out.println("SE");
				} else {
					System.out.println("divisa");
				}
			}
		}
		
		sc.close();
	}
}