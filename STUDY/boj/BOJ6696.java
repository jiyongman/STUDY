package boj;
import java.util.*;

public class BOJ6696 { // Too Much Water

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            double X = sc.nextDouble();
            double Y = sc.nextDouble();

            if (X == 0 && Y == 0) {
                break;
            }

            int Z = (int) Math.ceil(((X * X + Y * Y) * Math.PI / 2) / 50);

            System.out.printf("The property will be flooded in hour %d.\n", Z);
        }

        sc.close();
    }
}