package boj;
import java.util.*;

public class BOJ17293 { // 맥주 99병

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tmp = N;

        while (N >= 0) {
            if (N >= 2) {
                System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n", N, N);
                if (N > 2) {
                    System.out.printf("Take one down and pass it around, %d bottles of beer on the wall.\n\n", (N - 1));
                } else {
                    System.out.printf("Take one down and pass it around, %d bottle of beer on the wall.\n\n", (N - 1));
                }
            } else if (N == 1) {
                System.out.printf("%d bottle of beer on the wall, %d bottle of beer.\n", N, N);
                System.out.print("Take one down and pass it around, no more bottles of beer on the wall.\n\n");
            } else {
                System.out.print("No more bottles of beer on the wall, no more bottles of beer.\n");
                if (tmp > 1) {
                    System.out.printf("Go to the store and buy some more, %d bottles of beer on the wall.\n\n", tmp);
                } else {
                    System.out.printf("Go to the store and buy some more, %d bottle of beer on the wall.\n\n", tmp);
                }
            }

            N--;
        }

        sc.close();
    }
}