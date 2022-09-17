package boj;
import java.util.*;

public class BOJ2588 { // 곱셈

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	    int b = sc.nextInt();
	    
	    System.out.println(a * (b % 10));
	    System.out.println(a * (b % 100 / 10));
		System.out.println(a * (b / 100));
		System.out.println(a * b);
		sc.close();
	}
}