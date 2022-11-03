package boj;
import java.util.*;

public class BOJ4482 { // Tetrahedral Stacks of Cannonballs

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of tetrahedral problems posed

        for (int i = 1; i <= n; i++) {
            int c = sc.nextInt(); // the number of cannonballs on each side of the base for a tetrahedron of cannonballs
            int sum = 0;

            for (int j = 1; j <= c; j++) {
                sum += j * (j + 1) / 2;
            }

            System.out.printf("%d: %d %d\n", i, c, sum);
        }

        sc.close();
    }
}