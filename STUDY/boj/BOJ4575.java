package boj;
import java.util.*;

public class BOJ4575 { // Refrigerator Magnets

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();

            if (str.equals("END")) {
                break;
            }

            int[] arr = new int[26];

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    arr[str.charAt(i) - 'A']++;
                }
            }

            int cnt = 0;

            for (int i = 0; i < 26; i++) {
                if (arr[i] < 2) {
                    cnt++;
                }
            }

            if (cnt == 26) {
                System.out.println(str);
            }
        }

        sc.close();
    }
}