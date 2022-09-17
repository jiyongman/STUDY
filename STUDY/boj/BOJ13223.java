package boj;
import java.util.*;

public class BOJ13223 { // 소금 폭탄
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.next().split(":");
		String[] arr2 = sc.next().split(":");
		
		int h = Integer.parseInt(arr2[0]) - Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr2[1]) - Integer.parseInt(arr[1]);
		int s = Integer.parseInt(arr2[2]) - Integer.parseInt(arr[2]);
		
		if (h == 0 && m == 0 && s == 0) {
			System.out.println("24:00:00");
		} else {
			if (s < 0) {
				s += 60;
				m--;
			}
		
			if (m < 0) {
				m += 60;
				h--;
			}
		
			if (h < 0) {
				h += 24;
			}
			
			System.out.printf("%02d:%02d:%02d", h, m, s);
		}
		
		sc.close();
	}
}