package boj;
import java.util.*;

public class BOJ14209 { // Bridž

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            String str = sc.next();

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'A') {
                    sum += 4;
                } else if (str.charAt(j) == 'K') {
                    sum += 3;
                } else if (str.charAt(j) == 'Q') {
                    sum += 2;
                } else if (str.charAt(j) == 'J') {
                    sum++;
                }
            }
        }

        System.out.println(sum);
        sc.close();
    }
}