package codeup;
import java.util.*;

public class CODEUP1096 { // 바둑판에 흰 돌 놓기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 바둑판에 올려놓은 흰 돌의 개수
		int[][] arr = new int[20][20];
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x - 1][y - 1] = 1;
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