package boj;
import java.util.*;

public class BOJ15238 { // Pirates

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the size of the word
        String str = sc.next(); // the word to process
        int[] arr = new int[26];

        for (int i = 0; i < n; i++) {
            arr[str.charAt(i) - 'a']++;
        }

        int max = 0;
        int result = 0;

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = i;
            }
        }

        System.out.printf("%c %d", (char) (result + 'a'), max);
        sc.close();
    }
}