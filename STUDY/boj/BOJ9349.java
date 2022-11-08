package boj;
import java.util.*;

public class BOJ9349 { // Fegla and the Bed Bugs

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int result = (N - 1) / (K - 1) - 1;

            System.out.println(result);
        }

        sc.close();
    }
}