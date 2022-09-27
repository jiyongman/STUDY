package boj;
import java.util.*;

public class BOJ11759 { // Bottled-Up Feelings

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // the volume of the shipment
        int v1 = sc.nextInt(); // the volumes of the bottles
        int v2 = sc.nextInt(); // the volumes of the bottles
        int n = s / v1;

        for (int i = n; i >= 0; i--) {
            int m = s - i * v1;

            if (m % v2 == 0) {
                System.out.println(i + " " + m / v2);
                return;
            }
        }

        System.out.println("Impossible");
        sc.close();
    }
}