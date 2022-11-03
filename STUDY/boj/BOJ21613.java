package boj;
import java.util.*;

public class BOJ21613 { // Silent Auction

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of bids collected at the silent auction
        String str = "";
        int max = 0;

        for (int i = 0; i < N; i++) {
            String str2 = sc.next(); // the person’s name
            int B = sc.nextInt(); // the amount of their bid

            if (max < B) {
                max = B;
                str = str2;
            }
        }

        System.out.println(str);
        sc.close();
    }
}