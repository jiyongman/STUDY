package boj;
import java.util.*;

public class BOJ3029 { // 경고
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = sc.next();
		String[] arr = str.split(":");
		String[] arr2 = str2.split(":");
		int[] arr3 = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr3[i] = Integer.parseInt(arr2[i]) - Integer.parseInt(arr[i]);
		}
		
		if (arr3[0] == 0 && arr3[1] == 0 && arr3[2] == 0) {
			System.out.println("24:00:00");
		} else {
			if (arr3[2] < 0) {
				arr3[2] += 60;
				arr3[1]--;
			}
		
			if (arr3[1] < 0) {
				arr3[1] += 60;
				arr3[0]--;
			}
		
			if (arr3[0] < 0) {
				arr3[0] += 24;
			}
			
			System.out.printf("%02d:%02d:%02d", arr3[0], arr3[1], arr3[2]);
		}
		
		sc.close();
	}
}