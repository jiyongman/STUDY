package boj;
import java.util.*;

public class BOJ6887 { // Squares

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of tiles
        int m = (int) Math.sqrt(n); // the maximum side length

        System.out.printf("The largest square has side length %d.", m);
        sc.close();
    }
}