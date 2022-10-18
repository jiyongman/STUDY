package boj;
import java.util.*;

public class BOJ11880 { // 개미

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 수
        long[] arr = new long[3];

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 3; j++) {
                arr[j] = sc.nextLong(); // 지우개의 가로, 세로의 길이와 높이
            }

            Arrays.sort(arr);
            long result = arr[2] * arr[2] + (arr[0] + arr[1]) * (arr[0] + arr[1]);

            System.out.println(result);
        }

        sc.close();
    }
}