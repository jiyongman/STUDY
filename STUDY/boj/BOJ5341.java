package boj;
import java.util.*;

public class BOJ5341 { // Pyramids

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int sum = n * (n + 1) / 2;

            System.out.println(sum);
        }

        sc.close();
    }
}