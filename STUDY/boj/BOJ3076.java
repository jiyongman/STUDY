package boj;
import java.util.*;

public class BOJ3076 { // 상근이의 체스판

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        for (int i = 0; i < R * A; i++) {
            if ((i / A) % 2 == 0) {
                for (int j = 0; j < B * C; j++) {
                    if ((j / B) % 2 == 0) {
                        System.out.print("X");
                    } else {
                        System.out.print(".");
                    }
                }
            } else {
                for (int j = 0; j < B * C; j++) {
                    if ((j / B) % 2 == 0) {
                        System.out.print(".");
                    } else {
                        System.out.print("X");
                    }
                }
            }

            System.out.println();
        }

        sc.close();
    }
}