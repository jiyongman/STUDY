package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ6479 { // Factorial Frequencies

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            BigInteger k = BigInteger.ONE;
            int i = 1;

            while (i <= n) {
                k = k.multiply(BigInteger.valueOf(i));
                i++;
            }

            String str = String.valueOf(k);
            int[] arr = new int[10];

            for (int j = 0; j < str.length(); j++) {
                arr[str.charAt(j) - '0']++;
            }

            System.out.printf("%d! --\n", n);

            for (int j = 0; j < 10; j++) {
                if (j == 0 || j == 5) {
                    System.out.printf("   (%d)%5d", j, arr[j]);
                } else {
                    System.out.printf("    (%d)%5d", j, arr[j]);
                }

                if (j == 4 || j == 9) {
                    System.out.println();
                }
            }
        }

        sc.close();
    }
}