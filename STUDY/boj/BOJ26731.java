package boj;
import java.util.*;

public class BOJ26731 { // Zagubiona litera

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'A']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) {
                System.out.println((char) (i + 'A'));
                break;
            }
        }

        sc.close();
    }
}