package boj;
import java.util.*;

public class BOJ2997 { // 네 번째 수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		if (arr[1] - arr[0] == arr[2] - arr[1]) { // 등차수열의 첫 번째 항이나 네 번째 항을 모르는 경우
			System.out.println(arr[2] + (arr[1] - arr[0]));
		} else if (2 * (arr[1] - arr[0]) == arr[2] - arr[1]) { // 등차수열의 세 번째 항을 모르는 경우
			System.out.println(arr[1] + (arr[1] - arr[0]));
		} else { // 등차수열의 두 번째 항을 모르는 경우
			System.out.println(arr[0] + (arr[2] - arr[1]));
		}
		
		sc.close();
	}
}