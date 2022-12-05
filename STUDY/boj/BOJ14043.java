package boj;
import java.util.*;

public class BOJ14043 { // Ragaman

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }

        String str2 = sc.next();
        int[] arr2 = new int[26];
        int cnt = 0;

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z') {
                arr2[str2.charAt(i) - 'a']++;
            } else {
                cnt++;
            }
        }

        for (int i = 0; i < 26; i++) {
            cnt -= Math.abs(arr[i] - arr2[i]);
        }

        if (cnt == 0) {
            System.out.println("A");
        } else {
            System.out.println("N");
        }

        sc.close();
    }
}