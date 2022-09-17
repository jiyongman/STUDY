package boj;
import java.util.*;

public class BOJ13985 { // Equality

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // a string of the form: a + b = c
		int a = str.charAt(0) - '0'; // string a to char a and char a to int a
		int b = str.charAt(4) - '0'; // string b to char b and char b to int b
		int c = str.charAt(8) - '0'; // string c to char c and char c to int c
		
		if (a + b == c) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		sc.close();
	}
}