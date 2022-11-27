package boj;
import java.util.*;

public class BOJ7582 { // On the Bus

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next(); // the route number
            int Z = sc.nextInt(); // the size of the bus

            if (str.equals("#") && Z == 0) {
                break;
            }

            int P = sc.nextInt(); // the initial number of passengers on the bus
            int S = sc.nextInt(); // the number of stops

            for (int i = 0; i < S; i++) {
                int N = sc.nextInt(); // the number of passengers getting off at the stop
                int M = sc.nextInt(); // the number of passengers waiting to board
                P -= N;
                P += M;

                if (P > Z) {
                    P = Z;
                }
            }

            System.out.printf("%s %d\n", str, P);
        }

        sc.close();
    }
}