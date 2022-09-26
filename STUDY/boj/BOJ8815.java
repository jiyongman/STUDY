package boj;
import java.util.*;

public class BOJ8815 { // Test

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Z = sc.nextInt(); // the number of test sets

        for (int i = 0; i < Z; i++) {
            int N = sc.nextInt();

            if (N % 12 == 1 || N % 12 == 9 || N % 12 == 11) {
                System.out.println("A");
            } else if (N % 12 == 2 || N % 12 == 4 || N % 12 == 0) {
                System.out.println("B");
            } else if (N % 12 == 3 || N % 12 == 5 || N % 12 == 7) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        }

        sc.close();
    }
}