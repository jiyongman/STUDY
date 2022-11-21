package boj;
import java.util.*;

public class BOJ16103 { // Drawn and Quartered

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the length of the string
        long K = sc.nextLong(); // the number of times you should perform a switcheroo to S
        K %= 3;
        String S = sc.next();

        for (int i = 0; i < K; i++) {
            String tmp = "";
            tmp += S.substring(0, (N / 4));
            tmp += S.substring(N - (N / 4));
            tmp += S.substring((N / 4), N - (N / 4));
            S = tmp;
        }

        System.out.println(S);
        sc.close();
    }
}