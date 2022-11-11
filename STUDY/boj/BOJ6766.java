package boj;
import java.util.*;

public class BOJ6766 { // Big Bang Secrets

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); // the shift value
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            int S = 3 * (i + 1) + K;
            char ch = (char) (str.charAt(i) - S);

            if (ch < 'A') {
                ch += 26;
            }

            System.out.print(ch);
        }

        sc.close();
    }
}