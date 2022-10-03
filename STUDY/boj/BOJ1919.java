package boj;
import java.util.*;

public class BOJ1919 { // 애너그램 만들기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        int[] arr = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            arr2[str2.charAt(i) - 'a']++;
        }

        int result = 0;

        for (int i = 0; i < 26; i++) {
            if (arr[i] != arr2[i]) {
                result += Math.abs(arr[i] - arr2[i]);
            }
        }

        System.out.println(result);
        sc.close();
    }
}