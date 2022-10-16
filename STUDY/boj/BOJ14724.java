package boj;
import java.util.*;

public class BOJ14724 { // 관리자는 누구?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 동아리원의 수
        int max = 0;
        int result = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < N; j++) {
                int K = sc.nextInt(); // 각 동아리원들이 문제를 푼 개수

                if (K > max) {
                    max = K;
                    result = i;
                }
            }
        }

        String[] arr = {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};

        System.out.println(arr[result]);
        sc.close();
    }
}