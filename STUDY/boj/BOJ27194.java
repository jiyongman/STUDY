package boj;
import java.util.*;

public class BOJ27194 { // Meeting Near the Fountain

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double T = sc.nextDouble();
        double m = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double street = m / (x * 60);
        double park = (n - m) / (y * 60);
        int L = 0;

        if (street + park > T) {
            L = (int) (Math.ceil(street + park - T));
        }

        System.out.println(L);
        sc.close();
    }
}