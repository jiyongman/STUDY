package boj;
import java.util.*;

public class BOJ6784 { // Multiple Choice

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] arr = new char[N];
        char[] arr2 = new char[N];

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            arr[i] = str.charAt(0); // student responses
        }

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            arr2[i] = str.charAt(0); // correct answers
        }

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] == arr2[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}