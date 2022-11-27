package boj;
import java.util.*;

public class BOJ21301 { // Comfy Deviations

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] t = new double[10];
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            t[i] = sc.nextDouble();
            sum += t[i];
        }

        double avg = sum / 10;
        double s = 0;

        for (int i = 0; i < 10; i++) {
            s += Math.pow(t[i] - avg, 2);
        }

        s /= 9;
        s = Math.sqrt(s);

        if (s <= 1) {
            System.out.println("COMFY");
        } else {
            System.out.println("NOT COMFY");
        }

        sc.close();
    }
}