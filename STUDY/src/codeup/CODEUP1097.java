package codeup;
import java.util.*;

public class CODEUP1097 { // 바둑알 십자 뒤집기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[20][20];
		
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int n = sc.nextInt(); // 십자 뒤집기 횟수
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int j = 0; j < 19; j++) {
				if (arr[x - 1][j] == 0) {
					arr[x - 1][j] = 1;
				} else {
					arr[x- 1][j] = 0;
				}
			}
			for (int k = 0; k < 19; k++) {
				if (arr[k][y - 1] == 0) {
					arr[k][y - 1] = 1;
				} else {
					arr[k][y - 1] = 0;
				}
			}
		}
		
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
 		}
		
		sc.close();
	}
}