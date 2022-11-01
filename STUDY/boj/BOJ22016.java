package boj;
import java.util.*;

public class BOJ22016 { // 巻物 (Scroll)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        char[] arr = sc.next().toCharArray();

        for (int i = 0; i < K - 1; i++) {
            System.out.print(arr[i]);
        }

        for (int i = K - 1; i < N; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] -= 32;
            } else {
                arr[i] += 32;
            }

            System.out.print(arr[i]);
        }

        sc.close();
    }
}