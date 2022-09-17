package boj;
import java.util.*;

public class BOJ17010 { // Time to Decompress
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt(); // the number of lines in the message
		
		for (int i = 0; i < L; i++) {
			int N = sc.nextInt();
			String str = sc.next();
			
			for (int j = 0; j < N; j++) {
				System.out.print(str);
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}