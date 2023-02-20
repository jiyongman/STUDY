package boj;
import java.util.*;

public class BOJ27226 { // Лестница из чисел

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        for (int i = a; i <= b; i++) {
            long first = (long) i * (i - 1) / 2;

            for (int j = 1; j <= Math.min(i, k); j++) {
                System.out.printf("%d ", first + j);
            }

            System.out.println();
        }

        sc.close();
    }
}