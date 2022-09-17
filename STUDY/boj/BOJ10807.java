package boj;
import java.util.*;

public class BOJ10807 { // 개수 세기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정수의 개수
        int[] arr = new int[N];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt(); // 찾으려고 하는 정수

        for (int i = 0; i < N; i++) {
            if (arr[i] == v) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}