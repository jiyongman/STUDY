package boj;
import java.util.*;

public class BOJ15354 { // Aron

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] arr = new char[N];

        for (int i = 0; i < N; i++) {
            String str = sc.next(); // the shirt colour of the i th person in line
            arr[i] = str.charAt(0);
        }

        int cnt = 2;

        for (int i = 0; i < N - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}