package boj;
import java.util.*;

public class BOJ2399 { // 거리의 합

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 수직선에 찍힌 점의 개수
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 각각의 점의 x좌표
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += Math.abs(arr[i] - arr[j]);
            }
        }

        System.out.println(sum);
        sc.close();
    }
}