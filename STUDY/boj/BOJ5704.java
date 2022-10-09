package boj;
import java.util.*;

public class BOJ5704 { // 팬그램

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();

            if (str.equals("*")) {
                break;
            }

            int[] arr = new int[26];

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    continue;
                } else {
                    arr[str.charAt(i) - 'a']++;
                }
            }

            int cnt = 0;

            for (int i = 0; i < 26; i++) {
                if (arr[i] > 0) {
                    cnt++;
                }
            }

            if (cnt == 26) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }

        sc.close();
    }
}