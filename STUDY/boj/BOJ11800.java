package boj;
import java.util.*;

public class BOJ11800 { // Tawla
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 전체 테스트 개수
		String[] arr = {"Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh"};
		
		for (int n = 1; n <= T; n++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.print("Case " + n + ": ");
			
			if (a == 1 && b == 1) {
				System.out.print("Habb Yakk");
			} else if (a == 2 && b == 2) {
				System.out.print("Dobara");
			} else if (a == 3 && b == 3) {
				System.out.print("Dousa");
			} else if (a == 4 && b == 4) {
				System.out.print("Dorgy");
			} else if (a == 5 && b == 5) {
				System.out.print("Dabash");
			} else if (a == 6 && b == 6) {
				System.out.print("Dosh");
			} else if ((a == 6 && b == 5) || (a == 5 && b == 6)) {
				System.out.print("Sheesh Beesh");
			} else {
				if (a < b) {
					System.out.print(arr[b - 1] + " " + arr[a - 1]);
				} else {
					System.out.print(arr[a - 1] + " " + arr[b - 1]);
				}
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}