package boj;
import java.util.*;

public class BOJ5103 { // DVDs

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();

            if (str.equals("#")) {
                break;
            }

            int M = sc.nextInt(); // the maximum number of DVDs of that title that can be held in stock at any one time
            int S = sc.nextInt(); // the number of that title currently in stock
            int T = sc.nextInt(); // the number of transactions
            int tmp = S;

            for (int i = 0; i < T; i++) {
                char ch = sc.next().charAt(0);
                int n = sc.nextInt();

                if (ch == 'S') {
                    tmp -= n;

                    if (tmp < 0) {
                        tmp = 0;
                    }
                } else {
                    tmp += n;

                    if (tmp > M) {
                        tmp = M;
                    }
                }
            }

            System.out.printf("%s %d\n", str, tmp);
        }

        sc.close();
    }
}