package boj;
import java.util.*;

public class BOJ27913 { // SciComLove (2023)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String str = "SciComLove";
        char[] arr = new char[N + 1];
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            arr[i] += str.charAt((i - 1) % 10);

            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                cnt++;
            }
        }

        for (int i = 0; i < Q; i++) {
            int X = sc.nextInt();

            if (arr[X] >= 'a' && arr[X] <= 'z') {
                arr[X] -= 32;
                cnt++;
            } else {
                arr[X] += 32;
                cnt--;
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}