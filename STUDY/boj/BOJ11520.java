package boj;
import java.util.*;

public class BOJ11520 { // And Then There Was 5

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of test cases

        for (int i = 0; i < N; i++) {
            int P = sc.nextInt(); // an offset into the digits of π
            int D = sc.nextInt(); // a digit to find in π
            int Q = D; // the lowest offset such that Q >= P and the Qth digit of π equals D
            int R = 5; // the lowest offset such that R > Q and the Rth digit of π equals 5

            System.out.println(Q + " " + R);
        }

        sc.close();
    }
}