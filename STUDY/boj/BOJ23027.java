package boj;
import java.util.*;

public class BOJ23027 { // 1번부터 문제의 상태가…?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] arr = new int[26];

        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 'A']++;
        }

        if (arr[0] > 0) {
            S = S.replaceAll("[BCDF]", "A");
        } else if (arr[0] == 0 && arr[1] > 0) {
            S = S.replaceAll("[CDF]", "B");
        } else if (arr[0] == 0 && arr[1] == 0 && arr[2] > 0) {
            S = S.replaceAll("[DF]", "C");
        } else {
            S = S.replaceAll("[DEFGHIJKLMNOPQRSTUVWXYZ]", "A");
        }

        System.out.println(S);
        sc.close();
    }
}