package boj;
import java.util.*;

public class BOJ22015 { // 金平糖 (Konpeito)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt(); // the number of konpeito that Aoi, Rin and Rie-sensei ate
		}
		
		Arrays.sort(arr);
		System.out.println((arr[2] - arr[0]) + (arr[2] - arr[1])); // the minimum number of additional konpeito to be eaten
		sc.close();
	}
}