package boj;
import java.util.*;

public class BOJ18414 { // X に最も近い値 (The Nearest Value)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int L = sc.nextInt();
		int R = sc.nextInt();
		
		if (X <= L) {
			System.out.println(L);
		} else if (X >= R) {
			System.out.println(R);
		} else {
			System.out.println(X);
		}
		
		sc.close();
	}
}