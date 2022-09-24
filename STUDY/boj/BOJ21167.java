package boj;
import java.util.*;

public class BOJ21167 { // Curve Speed

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int R = sc.nextInt(); // the radius of the curve in feet
            double S = sc.nextDouble(); // the superelevation
            double V = Math.round(Math.sqrt((R * (S + 0.16)) / 0.067)); // the maximum speed

            System.out.println((int) V);
        }

        sc.close();
    }
}