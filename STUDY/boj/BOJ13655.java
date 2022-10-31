package boj;
import java.util.*;

public class BOJ13655 { // Guarda Costeira

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double D = sc.nextDouble(); // the initial distance between the fugitive and the Coast Guard
            double VF = sc.nextDouble(); // the speed of the fugitive's vessel
            double VG = sc.nextDouble(); // the speed of the Coast Guard vessel

            if (Math.sqrt(D * D + 144) / VG <= 12 / VF) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        }

        sc.close();
    }
}