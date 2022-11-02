package boj;
import java.util.*;

public class BOJ24080 { // 複雑な文字列 (Complex String)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int[] arr = new int[5];

        for (int i = 0; i < N; i++) {
            arr[S.charAt(i) - 'A']++;
        }

        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                cnt++;
            }
        }

        if (cnt >= 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}