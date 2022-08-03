package boj;
import java.util.*;

public class BOJ2447 { // 별 찍기 - 10
	
	static char[][] arr;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new char[N][N];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = ' ';
            }
        }
		
		recursive(0, 0, N);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
		sc.close();
	}
	
	public static void recursive(int a, int b, int N) {
        
		if (N == 1) { // 더 이상 나눌 수 없는 경우
            arr[a][b] = '*';
            return;
        }

        N /= 3;

        for (int i = 0; i < 3; i++) { // N이 1이 될 때까지 3x3 크기로 계속 분할
           for (int j = 0; j < 3; j++) {
               if (i == 1 && j == 1) { // 가운데에 공백이 있는 경우
                   continue;
               }

               recursive(a + (i * N), b + (j * N), N);
           }
        }
    }
}