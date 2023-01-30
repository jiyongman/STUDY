package boj;
import java.util.*;

public class BOJ27333 { // JOI エディタ (JOI Editor)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] arr = S.toCharArray();

        for (int i = 1; i < N; i++) {
            if (arr[i - 1] == arr[i]) {
                arr[i - 1] = Character.toUpperCase(arr[i - 1]);
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]);
        }

        sc.close();
    }
}