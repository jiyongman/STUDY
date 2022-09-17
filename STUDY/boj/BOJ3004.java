package boj;
import java.util.*;

public class BOJ3004 { // 체스판 조각
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int row = N / 2 + 1;
		int col = N - row + 2;
		
		System.out.println(row * col);
		sc.close();
	}
}