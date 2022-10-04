package boj;
import java.util.*;

public class BOJ13300 { // 방 배정

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 수학여행에 참가하는 학생 수
        int K = sc.nextInt(); // 한 방에 배정할 수 있는 최대 인원 수
        int[][] arr = new int[6][2];

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt() - 1;
            arr[b][a]++;
        }

        int cnt = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                if (arr[i][j] > K) {
                    if (arr[i][j] % K == 0) {
                        cnt += arr[i][j] / K;
                    } else {
                        cnt += arr[i][j] / K + 1;
                    }
                } else if (arr[i][j] > 0){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}