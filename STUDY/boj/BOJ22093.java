package boj;
import java.util.*;

public class BOJ22093 { // Соцопрос

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases
        int min = 0;
        int max = 0;

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt(); // the number of participants
            int a = sc.nextInt(); // the number of those who can solve a certain type of problem
            int b = sc.nextInt(); // the number of those who find problems of this type disgusting

            min = a - b;

            if (min < 0) {
                min = 0;
            }

            max = n - b;

            if (a < max) {
                max = a;
            }

            System.out.println(min + " " + max);
        }

        sc.close();
    }
}