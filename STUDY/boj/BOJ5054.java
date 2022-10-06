package boj;
import java.util.*;

public class BOJ5054 { // 주차의 신

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // 선영이가 방문할 상점의 수
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt(); // 상점의 위치
            }

            Arrays.sort(arr);
            int result = 2 * (arr[n - 1] - arr[0]);

            System.out.println(result);
        }

        sc.close();
    }
}