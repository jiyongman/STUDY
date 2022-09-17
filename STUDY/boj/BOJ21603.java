package boj;
import java.util.*;

public class BOJ21603 { // K 2K 게임
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int fK = K % 10;
		int f2K = 2 * K % 10;
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (int x = 1; x <= N; x++) {
			int fx = x % 10;
			
			if (fx != fK && fx != f2K) {
				arr.add(x);
			}
		}
		
		System.out.println(arr.size());
		
		for (int x = 0; x < arr.size(); x++) {
			System.out.print(arr.get(x) + " ");
		}
		
		sc.close();
	}
}