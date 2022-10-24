package boj;
import java.util.*;

public class BOJ15600 { // Boss Battle

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of pillars in the room

        if (n <= 3) {
            System.out.println(1);
        } else {
            System.out.println(n - 2);
        }

        sc.close();
    }
}