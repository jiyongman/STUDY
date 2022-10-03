package boj;
import java.util.*;

public class BOJ10996 { // 별 찍기 - 21

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < 2 * N; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < N; j++) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j = 0; j < N; j++) {
                    if (j % 2 > 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }

        sc.close();
    }
}