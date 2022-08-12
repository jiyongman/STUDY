package boj;
import java.util.*;

public class BOJ13698 { // Hawk eyes
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = new char[str.length()];
		int[] arr2 = new int[4];
		arr2[0] = 1; // 작은 공 위치
		arr2[1] = 0;
		arr2[2] = 0;
		arr2[3] = 2; // 큰 공 위치
		
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			
			if (arr[i] == 'A') {
				int tmp = arr2[0];
				arr2[0] = arr2[1];
				arr2[1] = tmp;
			} else if (arr[i] == 'B') {
				int tmp = arr2[0];
				arr2[0] = arr2[2];
				arr2[2] = tmp;
			} else if (arr[i] == 'C') {
				int tmp = arr2[0];
				arr2[0] = arr2[3];
				arr2[3] = tmp;
			} else if (arr[i] == 'D')  {
				int tmp = arr2[1];
				arr2[1] = arr2[2];
				arr2[2] = tmp;
			} else if (arr[i] == 'E') {
				int tmp = arr2[1];
				arr2[1] = arr2[3];
				arr2[3] = tmp;
			} else {
				int tmp = arr2[2];
				arr2[2] = arr2[3];
				arr2[3] = tmp;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			if (arr2[i] == 1) {
				System.out.println(i + 1);
			}
		}
		
		for (int i = 0; i < 4; i++) {
			if (arr2[i] == 2) {
				System.out.println(i + 1);
			}
		}
		
		sc.close();
	}
}