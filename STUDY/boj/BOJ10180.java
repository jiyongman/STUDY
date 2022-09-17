package boj;
import java.util.*;

public class BOJ10180 { // Ship Selection

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // the number of test cases
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt(); // the number of ships in the docking bay
			int D = sc.nextInt(); // the distance in light-years to the expedition site
			int cnt = 0;
			
			for (int j = 0; j < N; j++) {
				double vi = sc.nextDouble(); // the top speed of ship i in light-years per hour
				double fi = sc.nextDouble(); // the fuel on ship i in kilos of deuterium
				double ci = sc.nextDouble(); // the fuel consumption of ship i in kilos of deuterium per hour
				
				if (D <= vi * fi / ci) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
		
		sc.close();
	}
}