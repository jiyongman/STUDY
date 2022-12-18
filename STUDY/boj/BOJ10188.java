package boj;
import java.util.*;

public class BOJ10188 { // Quadrilateral

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of data sets

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt(); // the length of the quadrilateral
            int w = sc.nextInt(); // the width of the quadrilateral

            for (int j = 0; j < w; j++) {
                for (int k = 0; k < l; k++) {
                    System.out.print("X");
                }

                System.out.println();
            }

            System.out.println();
        }

        sc.close();
    }
}