package boj;
import java.util.*;

public class BOJ20540 { // 연길이의 이상형
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = new char[4];
		
		for (int i = 0; i < 4; i++) {
			arr[i] = str.charAt(i);
			
			if (arr[i] == 'E') {
				arr[i] = 'I';
			} else if (arr[i] == 'I') {
				arr[i] = 'E';
			} else if (arr[i] == 'S') {
				arr[i] = 'N';
			} else if (arr[i] == 'N') {
				arr[i] = 'S';
			} else if (arr[i] == 'T') {
				arr[i] = 'F';
			} else if (arr[i] == 'F') {
				arr[i] = 'T';
			} else if (arr[i] == 'J') {
				arr[i] = 'P';
			} else {
				arr[i] = 'J';
			}
			
			System.out.print(arr[i]);
		}
		
		sc.close();
	}
}