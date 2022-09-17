package boj;
import java.util.*;

public class BOJ24079 { // 移動 (Moving)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); // the hours to move from point A to point B
		int Y = sc.nextInt(); // the hours to move from point B to point C
		int Z = sc.nextInt(); // the hours to move from point A to point C via point B within 30 minutes of Z time
		
		if (X + Y <= Z + 0.5) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		sc.close();
	}
}