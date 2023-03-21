package boj;
import java.util.*;

public class BOJ2391 { // Sascha

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String sascha = sc.next();
            int w = sc.nextInt();
            int min = Integer.MAX_VALUE;
            String answer = "";

            for (int j = 0; j < w; j++) {
                String word = sc.next();
                int cnt = 0;

                for (int k = 0; k < word.length(); k++) {
                    if (word.charAt(k) != sascha.charAt(k)) {
                        cnt++;
                    }
                }

                if (min > cnt) {
                    min = cnt;
                    answer = word;
                }
            }

            System.out.println(answer);
        }

        sc.close();
    }
}