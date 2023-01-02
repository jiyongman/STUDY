package boj;
import java.util.*;

public class BOJ27106 { // Making Change

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int P = 100 - sc.nextInt();
        int twentyfive = 0;
        int ten = 0;
        int five = 0;
        int one = 0;

        while (P > 0) {
            if (P >= 25) {
                P -= 25;
                twentyfive++;
            } else if (P >= 10) {
                P -= 10;
                ten++;
            } else if (P >= 5) {
                P -= 5;
                five++;
            } else {
                one = P;
                P = 0;
            }
        }

        System.out.printf("%d %d %d %d\n", twentyfive, ten, five, one);
        sc.close();
    }
}