package boj;
import java.util.*;

public class BOJ26574 { // Copier

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of numbers

        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();

            System.out.printf("%d %d\n", tmp, tmp);
        }

        sc.close();
    }
}