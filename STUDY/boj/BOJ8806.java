package boj;
import java.util.*;

public class BOJ8806 { // Papier kamień nożyczki

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Z = sc.nextInt(); // the number of test sets

        for (int i = 0; i < Z; i++) {
            double X1 = sc.nextDouble(); // the probability of Adam choosing paper
            double Y1 = sc.nextDouble(); // the probability of Adam choosing stone
            double Z1 = sc.nextDouble(); // the probability of Adam choosing scissors
            double X2 = sc.nextDouble(); // the probability of Gosia choosing paper
            double Y2 = sc.nextDouble(); // the probability of Gosia choosing stone
            double Z2 = sc.nextDouble(); // the probability of Gosia choosing scissors
            double A = X1 * Y2 + Y1 * Z2 + Z1 * X2;
            double G = X2 * Y1 + Y2 * Z1 + Z2 * X1;

            if (A > G) {
                System.out.println("ADAM");
            } else if (A < G) {
                System.out.println("GOSIA");
            } else {
                System.out.println("=");
            }
        }

        sc.close();
    }
}