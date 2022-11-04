package boj;
import java.util.*;

public class BOJ21945 { // Palindromes

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int cnt = 0;

            for (int j = 0; j < str.length() / 2; j++) {
                if (str.charAt(j) == str.charAt(str.length() - 1 - j)) {
                    cnt++;
                }
            }

            if (cnt == str.length() / 2) {
                sum += Integer.parseInt(str);
            }
        }

        System.out.println(sum);
        sc.close();
    }
}