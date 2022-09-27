package boj;
import java.util.*;

public class BOJ15415 { // Shattered Cake

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt(); // the width of the cake
        int N = sc.nextInt(); // the number of shattered pieces
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int w = sc.nextInt(); // the width of each piece
            int l = sc.nextInt(); // the length of each piece
            sum += w * l;
        }

        int L = sum / W;

        System.out.println(L);
        sc.close();
    }
}