package boj;
import java.util.*;

public class BOJ9161 { // Sir Bedavere’s Bogus Division Solutions
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				
				if (i % 111 == 0 && j % 111 == 0) {
					continue;
				}
				
				if ((i / 10) * j == i * (j % 100) && (i % 10 == j / 100)) {
					System.out.println(i + " / " + j + " = " + (i / 10) + " / " + (j % 100));
				}
			}
		}
		
		sc.close();
	}
}