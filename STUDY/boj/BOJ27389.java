package boj;
import java.util.*;

public class BOJ27389 { // Metronome

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = n / 4.0;

        System.out.printf("%.2f", d);
        sc.close();
    }
}