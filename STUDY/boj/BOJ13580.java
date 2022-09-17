package boj;
import java.util.*;

public class BOJ13580 { // Andando no tempo
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		for (int i = 0; i < 3; i++) { // the values of the three credits
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		if (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] + arr[1] == arr[2]) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
		
		sc.close();
	}
}