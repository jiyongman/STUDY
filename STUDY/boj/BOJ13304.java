package boj;
import java.util.*;

public class BOJ13304 { // 방 배정

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 수학여행에 참가하는 학생 수
        int K = sc.nextInt(); // 한 방에 배정할 수 있는 최대 인원 수
        int[] arr = new int[5];

        for (int i = 0; i < N; i++) {
            int S = sc.nextInt(); // 학생의 성별
            int Y = sc.nextInt(); // 학생의 학년

            if (Y <= 2) {
                arr[0]++;
            } else if (Y <= 4 && S == 0) {
                arr[1]++;
            } else if (Y <= 4 && S == 1) {
                arr[2]++;
            } else if (Y <= 6 && S == 0) {
                arr[3]++;
            } else {
                arr[4]++;
            }
        }

        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            if (arr[i] % K == 0) {
                cnt += arr[i] / K;
            } else {
                cnt += arr[i] / K + 1;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}