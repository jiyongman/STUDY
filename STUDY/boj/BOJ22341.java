package boj;
import java.util.*;

public class BOJ22341 { // 사각형 면적

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int NX = N;
        int NY = N;

        for (int i = 0; i < C; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (NX <= X || NY <= Y) {
                continue;
            }

            if (X * NY >= Y * NX) {
                NX = X;
            } else {
                NY = Y;
            }
        }

        System.out.println(NX * NY);
        sc.close();
    }
}