package boj;
import java.util.*;

public class BOJ4435 { // 중간계 전쟁
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 전투의 개수
		int[] arr = new int[6];
		int[] arr2 = new int[7];
		
		for (int i = 0; i < T; i++) {
			int sum = 0;
			int sum2 = 0;
			
			for (int j = 0; j < 6; j++) {
				arr[j] = sc.nextInt(); // 간달프 군대에 참여한 종족의 수
			}
			
			for (int j = 0; j < 7; j++) {
				arr2[j] = sc.nextInt(); // 사우론 군대에 참여한 종족의 수
			}
			
			sum = arr[0] + 2 * arr[1] + 3 * arr[2] + 3 * arr[3] + 4 * arr[4] + 10 * arr[5];
			sum2 = arr2[0] + 2 * arr2[1] + 2 * arr2[2] + 2 * arr2[3] + 3 * arr2[4] + 5 * arr2[5] + 10 * arr2[6];
			
			if (sum > sum2) {
				System.out.println("Battle " + (i + 1) + ": Good triumphs over Evil");
			} else if (sum < sum2) {
				System.out.println("Battle " + (i + 1) + ": Evil eradicates all trace of Good");
			} else {
				System.out.println("Battle " + (i + 1) + ": No victor on this battle field");
			}
		}
		
		sc.close();
	}
}