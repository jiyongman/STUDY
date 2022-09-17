package boj;
import java.util.*;

public class BOJ24568 { // Cupcake Party

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(); // the number of regular boxes
        int S = sc.nextInt(); // the number of small boxes
        int result = R * 8 + S * 3 - 28; // left over

        if (result < 0) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }

        sc.close();
    }
}