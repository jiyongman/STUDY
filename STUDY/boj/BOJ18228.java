package boj;
import java.util.*;

public class BOJ18228 { // 펭귄추락대책위원회

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 얼음의 개수
        int[] arr = new int[N];
        int P = 0; // 펭귄의 위치

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 얼음을 깨뜨리는 데에 드는 힘

            if (arr[i] == -1) {
                P = i;
            }
        }

        int min = 1000000000;

        for (int i = 0; i < P; i++) {
            min = Math.min(min, arr[i]);
        }

        int min2 = 1000000000;

        for (int i = P + 1; i < N; i++) {
            min2 = Math.min(min2, arr[i]);
        }

        int result = min + min2;

        System.out.println(result);
        sc.close();
    }
}