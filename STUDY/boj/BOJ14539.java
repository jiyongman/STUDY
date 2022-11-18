package boj;
import java.util.*;

public class BOJ14539 { // Grid Pattern

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of test cases

        for (int i = 1; i <= N; i++) {
            int row = sc.nextInt(); // the number of rows
            int col = sc.nextInt(); // the number of columns
            int w = sc.nextInt(); // the width of the single grid
            int h = sc.nextInt(); // the height of the single grid

            System.out.printf("Case #%d:\n", i);
            System.out.print("+");

            for (int j = 0; j < col; j++) {
                for (int k = 0; k < w; k++) {
                    System.out.print("-");
                }
                System.out.print("+");
            }

            System.out.println();

            for (int j = 0; j < row; j++) {
                for (int k = 0; k < h; k++) {
                    System.out.print("|");

                    for (int l = 0; l < col; l++) {
                        for (int m = 0; m < w; m++) {
                            System.out.print("*");
                        }
                        System.out.print("|");
                    }

                    System.out.println();
                }

                System.out.print("+");

                for (int k = 0; k < col; k++) {
                    for (int l = 0; l < w; l++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                }

                System.out.println();
            }
        }

        sc.close();
    }
}