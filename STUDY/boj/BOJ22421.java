package boj;
import java.util.*;

public class BOJ22421 { // Koto Municipal Subway

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            double D = sc.nextDouble();
            double E = sc.nextDouble();
            double result = 100;

            if (D == 0 && E == 0) {
                break;
            }

            for (double x = 0; x <= D; x++) {
                double y = D - x;
                result = Math.min(result, Math.abs(Math.sqrt(x * x + y * y) - E));
            }

            System.out.println(result);
        }

        sc.close();
    }   
}