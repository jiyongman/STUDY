package boj;
import java.util.*;

public class BOJ8668 { // Konik polny 2

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long s = sc.nextLong();

        if (x < 2 * s) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }

        sc.close();
    }
}