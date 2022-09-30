package boj;
import java.util.*;

public class BOJ1350 { // 진짜 공간

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 파일의 개수
        long[] arr = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong(); // 파일의 크기
        }

        long c = sc.nextLong(); // 클러스터의 크기
        long result = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] == 0) {
                continue;
            } else if (arr[i] < c) {
                result += c;
            } else {
                if (arr[i] % c == 0) {
                    result += c * (arr[i] / c);
                } else {
                    result += c * (arr[i] / c + 1);
                }
            }
        }

        System.out.println(result);
        sc.close();
    }
}