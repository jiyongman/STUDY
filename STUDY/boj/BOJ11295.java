package boj;
import java.util.*;

public class BOJ11295 { // Exercising

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int U = 1;

        while (true) {
            int L = sc.nextInt(); // the stride length, in centimetres, of the person using the pedometer

            if (L == 0) {
                break;
            }

            int N = sc.nextInt(); // the number of entries for this person

            System.out.println("User " + U);

            for (int i = 0; i < N; i++) {
                double S = sc.nextDouble(); // the number of steps the user has taken for the time period in question
                double d = L * S / 100000;

                System.out.printf("%.5f\n", d);
            }

            U++;
        }

        sc.close();
    }
}