package boj;
import java.util.*;

public class BOJ3047 { // ABC

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		String str = sc.next();
		
		for (int i = 0; i < 3; i++) {
			if (str.charAt(i) == 'A') {
				System.out.print(arr[0] + " ");
			} else if (str.charAt(i) == 'B') {
				System.out.print(arr[1] + " ");
			} else {
				System.out.print(arr[2] + " ");
			}
		}
		
		sc.close();
	}

}
