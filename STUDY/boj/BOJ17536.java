package boj;
import java.util.*;

public class BOJ17536 { // Hour for a Run

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double V = sc.nextDouble(); // the desired number of laps
        double N = sc.nextDouble(); // the number of signs along the track

        for (int i = 10; i < 100; i += 10) {
            System.out.printf("%d ", (int) Math.ceil(V * N * i / 100));
        }

        sc.close();
    }
}