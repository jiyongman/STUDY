package boj;
import java.util.*;

public class BOJ23756 { // 노브 돌리기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 준겸이가 맞추어야 하는 노브 각도의 개수
        int A = sc.nextInt(); // 노브의 초기 각도
        int[] arr = new int[N];
        int result = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 준겸이가 맞추어야 하는 노브 각도

            result += Math.min(Math.abs(arr[i] - A), Math.min(Math.abs(360 + arr[i] - A), Math.abs(360 - arr[i] + A)));
            A = arr[i];
        }

        System.out.println(result);
        sc.close();
    }
}