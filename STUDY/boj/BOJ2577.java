package boj;
import java.util.*;

public class BOJ2577 { // 숫자의 개수

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int num = A * B * C;
        
        while (num > 0) {
			arr[num % 10]++;
			num /= 10;
        }
		
        for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
        
        sc.close();
	}
}
