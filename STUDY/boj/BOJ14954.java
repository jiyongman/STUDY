package boj;
import java.util.*;

public class BOJ14954 { // Happy Number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[730];

        while (true) {
            int fn = 0;

            while (n > 0) {
                fn += Math.pow(n % 10, 2);
                n /= 10;
            }

            n = fn;

            if (n == 1) {
                System.out.println("HAPPY");
                break;
            } else if (arr[n] > 0) {
                System.out.println("UNHAPPY");
                break;
            }

            arr[n]++;
        }

        sc.close();
    }
}