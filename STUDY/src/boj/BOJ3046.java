package boj;
import java.util.*;

public class BOJ3046 { // R2

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int R1 = sc.nextInt();
        int S = sc.nextInt(); // S = (R1 + R2) / 2

        System.out.println(2 * S - R1); // R2 = 2 * S - R1
        sc.close();
    }
}