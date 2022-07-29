package boj;
import java.util.*;

public class BOJ15873 { // 공백 없는 A + B
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum = 0;
		
		if (x == 1010) {
			sum = 20;
		} else if (x < 110) {
			sum = x / 10 + x % 10;
		} else {
			sum = x / 100 + x % 100;
		} 
		
		System.out.println(sum);
		sc.close();
	}
}