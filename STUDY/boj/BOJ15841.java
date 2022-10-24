package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ15841 { // Virus Outbreak

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger[] arr = new BigInteger[490];
        arr[0] = BigInteger.ONE;
        arr[1] = BigInteger.ONE;

        for (int i = 2; i < 490; i++) {
            arr[i] = arr[i - 2].add(arr[i - 1]);
        }

        while (true) {
            int X = sc.nextInt(); // the hour

            if (X == -1) {
                break;
            }

            BigInteger Y = arr[X - 1];

            System.out.printf("Hour %d: %d cow(s) affected\n", X, Y);
        }

        sc.close();
    }
}