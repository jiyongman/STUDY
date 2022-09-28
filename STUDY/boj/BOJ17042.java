package boj;
import java.util.*;

public class BOJ17042 { // Elder

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // the label of the wizard that the wand obeyed
        char ch = str.charAt(0);
        int N = sc.nextInt(); // the number of duels
        int[] arr = new int[26];
        arr[ch - 'A'] = 1;

        for (int i = 0; i < N; i++) {
            String str2 = sc.next();
            String str3 = sc.next();
            char Z1 = str2.charAt(0);
            char Z2 = str3.charAt(0);

            if (ch == Z2) {
                arr[Z1 - 'A'] = 1;
                ch = Z1;
            }
        }

        int cnt = 0;

        for (int i = 0; i < 26; i++) {
            if (arr[i] == 1) {
                cnt++;
            }
        }

        System.out.println(ch);
        System.out.println(cnt);
        sc.close();
    }
}