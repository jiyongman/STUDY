package boj;
import java.util.*;

public class BOJ15059 { // Hard choice
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int[] arr2 = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt(); // the number of meals available for chicken, beef and pasta
		}
		
		for (int i = 0 ; i < 3; i++) {
			arr2[i] = sc.nextInt(); // the number of meals requested for chicken, beef and pasta
		}
		
		int sum = 0;
		
		for (int i = 0; i < 3; i++) {
			if (arr2[i] - arr[i] >= 0) {
				sum += arr2[i] - arr[i];
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}