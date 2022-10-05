package boj;
import java.util.*;

public class BOJ9076 { // 점수 집계

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int[] arr = new int[5];

            for (int j = 0; j < 5; j++) {
                arr[j] = sc.nextInt(); // 심판이 준 점수
            }

            Arrays.sort(arr);

            if (arr[3] - arr[1] >= 4) {
                System.out.println("KIN");
            } else {
                System.out.println(arr[1] + arr[2] + arr[3]);
            }
        }

        sc.close();
    }
}