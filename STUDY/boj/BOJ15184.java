package boj;
import java.util.*;

public class BOJ15184 { // Letter Count

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                arr[str.charAt(i) - 'A']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.printf("%c | ", (char) (i + 65));

            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}