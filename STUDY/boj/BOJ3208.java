package boj;
import java.util.*;

public class BOJ3208 { // gus

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); // the number of rows
        int N = sc.nextInt(); // the number of columns
        int result = 0;

        if (M > N) {
            result = 2 * (N - 1) + 1;
        } else {
            result = 2 * (M - 1);
        }

        System.out.println(result);
        sc.close();
    }
}