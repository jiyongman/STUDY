package boj;
import java.util.*;

public class BOJ24805 { // Climbing Worm

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // the amount of inches the worm can climb at a time
        int b = sc.nextInt(); // the amount of inches the worm falls during its resting period
        int h = sc.nextInt(); // the height of the pole
        int w = 0; // the worm's location
        int cnt = 0;

        while (true) {
            w += a;
            cnt++;

            if (w >= h) {
                break;
            }

            w -= b;
        }

        System.out.println(cnt);
        sc.close();
    }
}