package boj;
import java.util.*;

public class BOJ3449 { // 해밍 거리

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String str = sc.next();
            String str2 = sc.next();
            int X = 0; // 해밍 거리

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != str2.charAt(j)) {
                    X++;
                }
            }

            System.out.printf("Hamming distance is %d.\n", X);
        }

        sc.close();
    }
}