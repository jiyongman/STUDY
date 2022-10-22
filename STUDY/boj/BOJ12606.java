package boj;
import java.util.*;

public class BOJ12606 { // Reverse Words (Large)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine()); // the number of cases

        for (int x = 1; x <= N; x++) {
            String[] arr = sc.nextLine().split(" ");

            System.out.printf("Case #%d:", x);

            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.printf(" %s", arr[i]);
            }

            System.out.println();
        }

        sc.close();
    }
}