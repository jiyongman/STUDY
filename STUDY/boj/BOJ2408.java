package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ2408 { // 큰 수 계산

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[2 * N - 1];

        for (int i = 0; i < 2 * N - 1; i++) {
            arr[i] = sc.next();
        }

        String result = "";
        int blank = 0;

        for (int i = 1; i < 2 * N - 1; i += 2) {
            BigInteger a = new BigInteger(arr[i - 1]);
            BigInteger b = new BigInteger(arr[i + 1]);

            if (arr[i].equals("*")) {
                arr[i + 1] = String.valueOf(a.multiply(b));
                arr[i - 1] = "";
                arr[i] = "";
                blank += 2;
            } else if (arr[i].equals("/")) {
                if ((a.compareTo(BigInteger.ZERO) < 0 && b.compareTo(BigInteger.ZERO) > 0) || (a.compareTo(BigInteger.ZERO) > 0 && b.compareTo(BigInteger.ZERO) < 0)) {
                    arr[i + 1] = String.valueOf(a.divide(b).subtract(BigInteger.ONE));
                } else {
                    arr[i + 1] = String.valueOf(a.divide(b));
                }
                arr[i - 1] = "";
                arr[i] = "";
                blank += 2;
            }

            result = arr[i + 1];
        }

        String[] arr2 = new String[2 * N - 1 - blank];
        int j = 0;

        for (int i = 0; i < 2 * N - 1; i++) {
            if (!arr[i].equals("")) {
                arr2[j] = arr[i];
                j++;
            }
        }

        for (int i = 1; i < 2 * N - 1 - blank; i += 2) {
            BigInteger a = new BigInteger(arr2[i - 1]);
            BigInteger b = new BigInteger(arr2[i + 1]);

            if (arr2[i].equals("+")) {
                arr2[i + 1] = String.valueOf(a.add(b));
            } else if (arr2[i].equals("-")) {
                arr2[i + 1] = String.valueOf(a.subtract(b));
            }

            result = arr2[i + 1];
        }

        System.out.println(result);
        sc.close();
    }
}