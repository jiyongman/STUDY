package boj;
import java.util.*;

public class BOJ20155 { // 우리 집 밑에 편의점이 있는데

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt(); // 각 편의점 브랜드
            arr[X]++;
        }

        int max = 0;

        for (int i = 0; i < N; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
        sc.close();
    }
}