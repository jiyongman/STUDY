package boj;
import java.util.*;

public class BOJ13221 { // Manhattan
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // the intersection that you are waiting at for a taxi(x)
		int y = sc.nextInt(); // the intersection that you are waiting at for a taxi(y)
		int N = sc.nextInt(); // the number of available taxis in Manhattan
		int x1 = 0;
		int y1 = 0;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < N; i++) {
			int x2 = sc.nextInt(); // the positions of taxis around Manhattan(x2)
			int y2 = sc.nextInt(); // the positions of taxis around Manhattan(y2)
			min = Math.min(min, Math.abs((x2 - x)) + Math.abs((y2 - y)));
			
			if (min == Math.abs((x2 - x)) + Math.abs((y2 - y))) {
				x1 = x2;
				y1 = y2;
			}
		}
		
		System.out.println(x1 + " " + y1);
		sc.close();
	}
}