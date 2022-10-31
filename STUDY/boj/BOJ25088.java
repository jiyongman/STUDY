package boj;
import java.util.*;

public class BOJ25088 { // Punched Cards

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= T; x++) {
            int R = sc.nextInt(); // the number of rows
            int C = sc.nextInt(); // the number of columns
            
            System.out.printf("Case #%d:\n", x);

            for (int i = 0; i < 2 * R + 1; i++) {
                for (int j = 0; j < 2 * C + 1; j++) {
                    if (i == 0 && j == 0 || i == 0 && j == 1 || i == 1 && j == 0 || i == 1 && j == 1) {
                        System.out.print(".");
                    } else if (i % 2 == 0 && j % 2 == 0) {
                        System.out.print("+");
                    } else if (i % 2 == 0 && j % 2 > 0) {
                        System.out.print("-");
                    } else if (i % 2 > 0 && j % 2 == 0) {
                        System.out.print("|");
                    } else {
                        System.out.print(".");
                    }
                }

                System.out.println();
            }
        }

        sc.close();
    }
}