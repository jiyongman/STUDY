package boj;
import java.util.*;

public class BOJ5576 { // 콘테스트

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt(); // W 대학의 각 참가자의 점수
        }

        for (int i = 0; i < 10; i++) {
            arr2[i] = sc.nextInt(); // K 대학의 각 참가자의 점수
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);
        int sum = arr[7] + arr[8] + arr[9];
        int sum2 = arr2[7] + arr2[8] + arr2[9];

        System.out.printf("%d %d", sum, sum2);
        sc.close();
    }
}