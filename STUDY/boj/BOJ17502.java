package boj;
import java.util.*;

public class BOJ17502 { // 클레어와 팰린드롬

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 문자열의 길이
        char[] arr = sc.next().toCharArray();

        for (int i = 0; i < N; i++) {
            if (arr[i] == '?' && arr[N - 1 - i] == '?') {
                arr[i] = 'a';
                arr[N - 1 - i] = 'a';
            } else if (arr[i] == '?') {
                arr[i] = arr[N - 1 - i];
            } else if (arr[N - 1 - i] == '?') {
                arr[N - 1 - i] = arr[i];
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]);
        }

        sc.close();
    }
}