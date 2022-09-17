package boj;
import java.util.*;

public class BOJ15439 { // Vera and Outfits
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // the number of tops and pants Vera owns 
		
		System.out.println(N * (N - 1));
		sc.close();
	}
}