package boj;
import java.util.*;

public class BOJ16728 { // Chaarshanbegaan at Cafebazaar

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of dart shots for a player
        int score = 0;

        for (int i = 0; i < N; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double d = Math.sqrt(x * x + y * y);

            if (d < 10) {
                score += 10;
            } else if (d < 30) {
                score += 9;
            } else if (d < 50) {
                score += 8;
            } else if (d < 70) {
                score += 7;
            } else if (d < 90) {
                score += 6;
            } else if (d < 110) {
                score += 5;
            } else if (d < 130) {
                score += 4;
            } else if (d < 150) {
                score += 3;
            } else if (d < 170) {
                score += 2;
            } else if (d < 190) {
                score += 1;
            }
        }

        System.out.println(score);
        sc.close();
    }
}