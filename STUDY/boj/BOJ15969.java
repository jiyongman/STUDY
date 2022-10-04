package boj;
import java.util.*;

public class BOJ15969 { // 행복

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 학생 수
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 학생 점수
        }

        Arrays.sort(arr);
        int result = arr[N - 1] - arr[0];

        System.out.println(result);
        sc.close();
    }
}