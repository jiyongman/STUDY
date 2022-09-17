package boj;
import java.util.*;

public class BOJ16485 { // 작도하자! - ②
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double c = sc.nextDouble(); // 변 AB의 길이
		double b = sc.nextDouble(); // 변 AC의 길이
		
		System.out.println(c / b);
		sc.close();
	}
}