package boj;
import java.util.*;

public class BOJ17011 { // Cold Compress

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of lines

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            char ch = str.charAt(0);
            int cnt = 1;

            for (int j = 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    cnt++;
                } else {
                    System.out.printf("%d %c ", cnt, ch);
                    cnt = 1;
                }

                ch = str.charAt(j);

                if (j == str.length() - 1) {
                    System.out.printf("%d %c\n", cnt, ch);
                }
            }
        }

        sc.close();
    }
}