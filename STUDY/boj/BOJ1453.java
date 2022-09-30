package boj;
import java.util.*;

public class BOJ1453 { // 피시방 알바

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 손님의 수
        int[] arr = new int[101];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int s = sc.nextInt(); // 각 손님이 앉고 싶어하는 자리
            arr[s]++;

            if (arr[s] != 1) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}