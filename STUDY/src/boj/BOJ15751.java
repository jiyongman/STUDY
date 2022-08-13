package boj;
import java.util.*;

public class BOJ15751 { // Teleportation
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // the start locations
		int b = sc.nextInt(); // the end locations
		int x = sc.nextInt(); // the teleporter1
		int y = sc.nextInt(); // the teleporter2
		int min = Math.abs(b - a);
		int min2 = Math.abs(x - a) + Math.abs(y - b);
		int min3 = Math.abs(y - a) + Math.abs(x - b);
		
		System.out.println(Math.min(min, Math.min(min2, min3)));
		sc.close();
	}
}